/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simulator.config.ButtonBehaviour;
import simulator.config.ConfigPackage;
import simulator.config.Mode;
import simulator.config.ModeEntryAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.config.impl.ModeImpl#getName <em>Name</em>}</li>
 *   <li>{@link simulator.config.impl.ModeImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link simulator.config.impl.ModeImpl#getButtonBehaviours <em>Button Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeImpl extends EObjectImpl implements Mode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeEntryAction> entryActions;

	/**
	 * The cached value of the '{@link #getButtonBehaviours() <em>Button Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<ButtonBehaviour> buttonBehaviours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.MODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeEntryAction> getEntryActions() {
		if (entryActions == null) {
			entryActions = new EObjectContainmentEList<ModeEntryAction>(ModeEntryAction.class, this, ConfigPackage.MODE__ENTRY_ACTIONS);
		}
		return entryActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonBehaviour> getButtonBehaviours() {
		if (buttonBehaviours == null) {
			buttonBehaviours = new EObjectContainmentEList<ButtonBehaviour>(ButtonBehaviour.class, this, ConfigPackage.MODE__BUTTON_BEHAVIOURS);
		}
		return buttonBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.MODE__ENTRY_ACTIONS:
				return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
			case ConfigPackage.MODE__BUTTON_BEHAVIOURS:
				return ((InternalEList<?>)getButtonBehaviours()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.MODE__NAME:
				return getName();
			case ConfigPackage.MODE__ENTRY_ACTIONS:
				return getEntryActions();
			case ConfigPackage.MODE__BUTTON_BEHAVIOURS:
				return getButtonBehaviours();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.MODE__NAME:
				setName((String)newValue);
				return;
			case ConfigPackage.MODE__ENTRY_ACTIONS:
				getEntryActions().clear();
				getEntryActions().addAll((Collection<? extends ModeEntryAction>)newValue);
				return;
			case ConfigPackage.MODE__BUTTON_BEHAVIOURS:
				getButtonBehaviours().clear();
				getButtonBehaviours().addAll((Collection<? extends ButtonBehaviour>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.MODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigPackage.MODE__ENTRY_ACTIONS:
				getEntryActions().clear();
				return;
			case ConfigPackage.MODE__BUTTON_BEHAVIOURS:
				getButtonBehaviours().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.MODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigPackage.MODE__ENTRY_ACTIONS:
				return entryActions != null && !entryActions.isEmpty();
			case ConfigPackage.MODE__BUTTON_BEHAVIOURS:
				return buttonBehaviours != null && !buttonBehaviours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModeImpl
