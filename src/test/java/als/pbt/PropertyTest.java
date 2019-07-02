package als.pbt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.symbolsolver.javaparser.Navigator;

import org.apache.commons.io.FilenameUtils;
import org.junit.After;
import org.junit.Before;

/**
 * PropertyTest
 */
public class PropertyTest {
    final protected String NL = System.getProperty("line.separator");

    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    ByteArrayInputStream inStream;
    ByteArrayOutputStream errStream = new ByteArrayOutputStream();

    final PrintStream outOrig = System.out;
    final InputStream inOrig = System.in;
    final PrintStream errOrig = System.err;

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(outStream));
        System.setErr(new PrintStream(errStream));
    }

    protected void setInput(String data) {
        inStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inStream);
    }

    protected void setInput(Object data) {
        setInput(String.valueOf(data));
    }

    protected String getOutput() {
        return strip(outStream.toString());
    }

    protected String getError() {
        return errStream.toString();
    }

    protected String strip(String s) {
        return s.trim().replaceAll("\\n|\\r|\\r\\n", "").replaceAll(" +", " ");
    }

    protected String findPath(String dir, String name) {
        Path dirPath = Paths.get(dir);
        String path = dirPath.toString();
        try {
            path = Files.find(dirPath, Integer.MAX_VALUE, (a, b) -> a.getFileName().startsWith(name))
                    .findFirst().get().toString();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    protected MethodDeclaration getMethod(String classPath, String methodName) {
        File sourceFile = new File(classPath);
        CompilationUnit compilationUnit = null;
        try {
            compilationUnit = StaticJavaParser.parse(sourceFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ClassOrInterfaceDeclaration clazz = compilationUnit.getClassByName(FilenameUtils.getBaseName(classPath)).get();
        MethodDeclaration method = Navigator.demandMethod(clazz, methodName);
        return method;
    }

    protected boolean compareMethod(String path, String original, String testName) {
      MethodDeclaration testMethod = getMethod(path, testName);
      String test = testMethod.getDeclarationAsString() + " " + testMethod.getBody().get().toString();
      return original.equals(strip(test));
  }

    @After
    public void restoreSystemInputOutput() {
        System.setOut(outOrig);
        System.setIn(inOrig);
        System.setErr(errOrig);
    }
    
}