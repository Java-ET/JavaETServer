package utilities;

import org.python.core.Py;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Jython {
	private static PythonInterpreter interpreter;
	
	public static PyObject callScript(String path, String fileName, String methodName, Object... args) {
		interpreter = new PythonInterpreter();
		interpreter.cleanup();
		interpreter.execfile(path + fileName + ".py");
		
		return interpreter.get(methodName).__call__(Py.javas2pys(args));
	}
}
