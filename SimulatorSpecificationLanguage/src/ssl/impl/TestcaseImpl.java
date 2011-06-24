/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ssl.Given;
import ssl.SslPackage;
import ssl.Testcase;
import ssl.Then;
import ssl.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testcase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.TestcaseImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link ssl.impl.TestcaseImpl#getWhen <em>When</em>}</li>
 *   <li>{@link ssl.impl.TestcaseImpl#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestcaseImpl extends EObjectImpl implements Testcase {
	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected Given given;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected When when;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Then then;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestcaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SslPackage.Literals.TESTCASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given getGiven() {
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiven(Given newGiven, NotificationChain msgs) {
		Given oldGiven = given;
		given = newGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__GIVEN, oldGiven, newGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiven(Given newGiven) {
		if (newGiven != given) {
			NotificationChain msgs = null;
			if (given != null)
				msgs = ((InternalEObject)given).eInverseRemove(this, SslPackage.GIVEN__TESTCASE, Given.class, msgs);
			if (newGiven != null)
				msgs = ((InternalEObject)newGiven).eInverseAdd(this, SslPackage.GIVEN__TESTCASE, Given.class, msgs);
			msgs = basicSetGiven(newGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__GIVEN, newGiven, newGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs) {
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(When newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, SslPackage.WHEN__TESTCASE, When.class, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, SslPackage.WHEN__TESTCASE, When.class, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Then newThen, NotificationChain msgs) {
		Then oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(Then newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, SslPackage.THEN__TESTCASE, Then.class, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, SslPackage.THEN__TESTCASE, Then.class, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.TESTCASE__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SslPackage.TESTCASE__GIVEN:
				if (given != null)
					msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SslPackage.TESTCASE__GIVEN, null, msgs);
				return basicSetGiven((Given)otherEnd, msgs);
			case SslPackage.TESTCASE__WHEN:
				if (when != null)
					msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SslPackage.TESTCASE__WHEN, null, msgs);
				return basicSetWhen((When)otherEnd, msgs);
			case SslPackage.TESTCASE__THEN:
				if (then != null)
					msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SslPackage.TESTCASE__THEN, null, msgs);
				return basicSetThen((Then)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SslPackage.TESTCASE__GIVEN:
				return basicSetGiven(null, msgs);
			case SslPackage.TESTCASE__WHEN:
				return basicSetWhen(null, msgs);
			case SslPackage.TESTCASE__THEN:
				return basicSetThen(null, msgs);
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
			case SslPackage.TESTCASE__GIVEN:
				return getGiven();
			case SslPackage.TESTCASE__WHEN:
				return getWhen();
			case SslPackage.TESTCASE__THEN:
				return getThen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SslPackage.TESTCASE__GIVEN:
				setGiven((Given)newValue);
				return;
			case SslPackage.TESTCASE__WHEN:
				setWhen((When)newValue);
				return;
			case SslPackage.TESTCASE__THEN:
				setThen((Then)newValue);
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
			case SslPackage.TESTCASE__GIVEN:
				setGiven((Given)null);
				return;
			case SslPackage.TESTCASE__WHEN:
				setWhen((When)null);
				return;
			case SslPackage.TESTCASE__THEN:
				setThen((Then)null);
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
			case SslPackage.TESTCASE__GIVEN:
				return given != null;
			case SslPackage.TESTCASE__WHEN:
				return when != null;
			case SslPackage.TESTCASE__THEN:
				return then != null;
		}
		return super.eIsSet(featureID);
	}

} //TestcaseImpl
