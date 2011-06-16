/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractSslInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof ssl.ObserveRing) {
			result = interprete_ssl_ObserveRing((ssl.ObserveRing) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.ObserveVariableChange) {
			result = interprete_ssl_ObserveVariableChange((ssl.ObserveVariableChange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.ObserveLabelVariable) {
			result = interprete_ssl_ObserveLabelVariable((ssl.ObserveLabelVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.ObserveLabelValue) {
			result = interprete_ssl_ObserveLabelValue((ssl.ObserveLabelValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.ObserveButton) {
			result = interprete_ssl_ObserveButton((ssl.ObserveButton) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.ObserveMode) {
			result = interprete_ssl_ObserveMode((ssl.ObserveMode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Observation) {
			result = interprete_ssl_Observation((ssl.Observation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.PressButton) {
			result = interprete_ssl_PressButton((ssl.PressButton) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Action) {
			result = interprete_ssl_Action((ssl.Action) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.CheckLabel) {
			result = interprete_ssl_CheckLabel((ssl.CheckLabel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.CheckMode) {
			result = interprete_ssl_CheckMode((ssl.CheckMode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.CheckTimePastOther) {
			result = interprete_ssl_CheckTimePastOther((ssl.CheckTimePastOther) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Condition) {
			result = interprete_ssl_Condition((ssl.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Then) {
			result = interprete_ssl_Then((ssl.Then) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.When) {
			result = interprete_ssl_When((ssl.When) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Given) {
			result = interprete_ssl_Given((ssl.Given) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Testcase) {
			result = interprete_ssl_Testcase((ssl.Testcase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ssl.Specification) {
			result = interprete_ssl_Specification((ssl.Specification) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_ssl_Specification(ssl.Specification object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Testcase(ssl.Testcase object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Given(ssl.Given object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_When(ssl.When object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Then(ssl.Then object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Condition(ssl.Condition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_CheckTimePastOther(ssl.CheckTimePastOther object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_CheckMode(ssl.CheckMode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_CheckLabel(ssl.CheckLabel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Action(ssl.Action object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_PressButton(ssl.PressButton object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_Observation(ssl.Observation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveMode(ssl.ObserveMode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveButton(ssl.ObserveButton object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveLabelValue(ssl.ObserveLabelValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveLabelVariable(ssl.ObserveLabelVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveVariableChange(ssl.ObserveVariableChange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ssl_ObserveRing(ssl.ObserveRing object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
