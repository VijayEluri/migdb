/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.impl;

import java.util.Collection;

import mm.app.AppPackage;
import mm.app.ModelGeneration;
import mm.app.ModelRoot;

import mm.app.operations.ModelOperation;
import mm.app.operations.OperationsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.impl.ModelRootImpl#getModelGenerations <em>Model Generations</em>}</li>
 *   <li>{@link mm.app.impl.ModelRootImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelRootImpl extends EObjectImpl implements ModelRoot {
	/**
	 * The cached value of the '{@link #getModelGenerations() <em>Model Generations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGenerations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelGeneration> modelGenerations;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelGeneration> getModelGenerations() {
		if (modelGenerations == null) {
			modelGenerations = new EObjectContainmentWithInverseEList<ModelGeneration>(ModelGeneration.class, this, AppPackage.MODEL_ROOT__MODEL_GENERATIONS, AppPackage.MODEL_GENERATION__MODEL_ROOT);
		}
		return modelGenerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<ModelOperation>(ModelOperation.class, this, AppPackage.MODEL_ROOT__OPERATIONS, OperationsPackage.MODEL_OPERATION__MODEL_ROOT);
		}
		return operations;
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelGenerations()).basicAdd(otherEnd, msgs);
			case AppPackage.MODEL_ROOT__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				return ((InternalEList<?>)getModelGenerations()).basicRemove(otherEnd, msgs);
			case AppPackage.MODEL_ROOT__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				return getModelGenerations();
			case AppPackage.MODEL_ROOT__OPERATIONS:
				return getOperations();
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				getModelGenerations().clear();
				getModelGenerations().addAll((Collection<? extends ModelGeneration>)newValue);
				return;
			case AppPackage.MODEL_ROOT__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ModelOperation>)newValue);
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				getModelGenerations().clear();
				return;
			case AppPackage.MODEL_ROOT__OPERATIONS:
				getOperations().clear();
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
			case AppPackage.MODEL_ROOT__MODEL_GENERATIONS:
				return modelGenerations != null && !modelGenerations.isEmpty();
			case AppPackage.MODEL_ROOT__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelRootImpl
