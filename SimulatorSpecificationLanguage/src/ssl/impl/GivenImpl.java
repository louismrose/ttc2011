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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssl.Condition;
import ssl.Given;
import ssl.SslPackage;
import ssl.Testcase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Given</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.GivenImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link ssl.impl.GivenImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GivenImpl extends EObjectImpl implements Given {
	/**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
	protected EList<Condition> conditions;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GivenImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SslPackage.Literals.GIVEN;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Testcase getTestcase()
  {
    if (eContainerFeatureID() != SslPackage.GIVEN__TESTCASE) return null;
    return (Testcase)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestcase(Testcase newTestcase, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTestcase, SslPackage.GIVEN__TESTCASE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestcase(Testcase newTestcase)
  {
    if (newTestcase != eInternalContainer() || (eContainerFeatureID() != SslPackage.GIVEN__TESTCASE && newTestcase != null))
    {
      if (EcoreUtil.isAncestor(this, newTestcase))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTestcase != null)
        msgs = ((InternalEObject)newTestcase).eInverseAdd(this, SslPackage.TESTCASE__GIVEN, Testcase.class, msgs);
      msgs = basicSetTestcase(newTestcase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.GIVEN__TESTCASE, newTestcase, newTestcase));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Condition> getConditions() {
    if (conditions == null)
    {
      conditions = new EObjectContainmentWithInverseEList<Condition>(Condition.class, this, SslPackage.GIVEN__CONDITIONS, SslPackage.CONDITION__GIVEN);
    }
    return conditions;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetTestcase((Testcase)otherEnd, msgs);
      case SslPackage.GIVEN__CONDITIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditions()).basicAdd(otherEnd, msgs);
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
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        return basicSetTestcase(null, msgs);
      case SslPackage.GIVEN__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case SslPackage.GIVEN__TESTCASE:
        return eInternalContainer().eInverseRemove(this, SslPackage.TESTCASE__GIVEN, Testcase.class, msgs);
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
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        return getTestcase();
      case SslPackage.GIVEN__CONDITIONS:
        return getConditions();
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
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        setTestcase((Testcase)newValue);
        return;
      case SslPackage.GIVEN__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
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
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        setTestcase((Testcase)null);
        return;
      case SslPackage.GIVEN__CONDITIONS:
        getConditions().clear();
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
    switch (featureID)
    {
      case SslPackage.GIVEN__TESTCASE:
        return getTestcase() != null;
      case SslPackage.GIVEN__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GivenImpl
