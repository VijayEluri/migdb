/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.util;

import mm.rdb.operations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm.rdb.operations.OperationsPackage
 * @generated
 */
public class OperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsSwitch<Adapter> modelSwitch =
		new OperationsSwitch<Adapter>() {
			@Override
			public Adapter caseModelOperation(ModelOperation object) {
				return createModelOperationAdapter();
			}
			@Override
			public Adapter caseAddSchema(AddSchema object) {
				return createAddSchemaAdapter();
			}
			@Override
			public Adapter caseAddSequence(AddSequence object) {
				return createAddSequenceAdapter();
			}
			@Override
			public Adapter caseAddIndex(AddIndex object) {
				return createAddIndexAdapter();
			}
			@Override
			public Adapter caseAddTable(AddTable object) {
				return createAddTableAdapter();
			}
			@Override
			public Adapter caseAddColumn(AddColumn object) {
				return createAddColumnAdapter();
			}
			@Override
			public Adapter caseAddUniqueIndex(AddUniqueIndex object) {
				return createAddUniqueIndexAdapter();
			}
			@Override
			public Adapter caseAddPrimaryKey(AddPrimaryKey object) {
				return createAddPrimaryKeyAdapter();
			}
			@Override
			public Adapter caseAddForeignKey(AddForeignKey object) {
				return createAddForeignKeyAdapter();
			}
			@Override
			public Adapter caseAddNotNullConstraint(AddNotNullConstraint object) {
				return createAddNotNullConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.ModelOperation
	 * @generated
	 */
	public Adapter createModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddSchema <em>Add Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddSchema
	 * @generated
	 */
	public Adapter createAddSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddSequence <em>Add Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddSequence
	 * @generated
	 */
	public Adapter createAddSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddIndex
	 * @generated
	 */
	public Adapter createAddIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddTable <em>Add Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddTable
	 * @generated
	 */
	public Adapter createAddTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddColumn
	 * @generated
	 */
	public Adapter createAddColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddUniqueIndex <em>Add Unique Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddUniqueIndex
	 * @generated
	 */
	public Adapter createAddUniqueIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddPrimaryKey
	 * @generated
	 */
	public Adapter createAddPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddForeignKey <em>Add Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddForeignKey
	 * @generated
	 */
	public Adapter createAddForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddNotNullConstraint
	 * @generated
	 */
	public Adapter createAddNotNullConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperationsAdapterFactory
