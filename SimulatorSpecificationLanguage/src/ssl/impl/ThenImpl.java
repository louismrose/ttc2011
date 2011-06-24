/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ssl.Observation;
import ssl.SslPackage;
import ssl.Testcase;
import ssl.Then;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.ThenImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link ssl.impl.ThenImpl#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThenImpl extends EObjectImpl implements Then {
	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SslPackage.Literals.THEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testcase getTestcase() {
		if (eContainerFeatureID() != SslPackage.THEN__TESTCASE) return null;
		return (Testcase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestcase(Testcase newTestcase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTestcase, SslPackage.THEN__TESTCASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestcase(Testcase newTestcase) {
		if (newTestcase != eInternalContainer() || (eContainerFeatureID() != SslPackage.THEN__TESTCASE && newTestcase != null)) {
			if (EcoreUtil.isAncestor(this, newTestcase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTestcase != null)
				msgs = ((InternalEObject)newTestcase).eInverseAdd(this, SslPackage.TESTCASE__THEN, Testcase.class, msgs);
			msgs = basicSetTestcase(newTestcase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.THEN__TESTCASE, newTestcase, newTestcase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservations() {
		if (observations == null) {
			observations = new EObjectContainmentWithInverseEList<Observation>(Observation.class, this, SslPackage.THEN__OBSERVATIONS, SslPackage.OBSERVATION__THEN);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SslPackage.THEN__TESTCASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTestcase((Testcase)otherEnd, msgs);
			case SslPackage.THEN__OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservations()).basicAdd(otherEnd, msgs);
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
			case SslPackage.THEN__TESTCASE:
				return basicSetTestcase(null, msgs);
			case SslPackage.THEN__OBSERVATIONS:
				return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SslPackage.THEN__TESTCASE:
				return eInternalContainer().eInverseRemove(this, SslPackage.TESTCASE__THEN, Testcase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SslPackage.THEN__TESTCASE:
				return getTestcase();
			case SslPackage.THEN__OBSERVATIONS:
				return getObservations();
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
			case SslPackage.THEN__TESTCASE:
				setTestcase((Testcase)newValue);
				return;
			case SslPackage.THEN__OBSERVATIONS:
				getObservations().clear();
				getObservations().addAll((Collection<? extends Observation>)newValue);
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
			case SslPackage.THEN__TESTCASE:
				setTestcase((Testcase)null);
				return;
			case SslPackage.THEN__OBSERVATIONS:
				getObservations().clear();
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
			case SslPackage.THEN__TESTCASE:
				return getTestcase() != null;
			case SslPackage.THEN__OBSERVATIONS:
				return observations != null && !observations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThenImpl
