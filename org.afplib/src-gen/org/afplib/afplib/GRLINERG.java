/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRLINERG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GRLINERG#getXOSSF <em>XOSSF</em>}</li>
 *   <li>{@link org.afplib.afplib.GRLINERG#getYOFFS <em>YOFFS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGRLINERG()
 * @model
 * @generated
 */
public interface GRLINERG extends Triplet {
	/**
	 * Returns the value of the '<em><b>XOSSF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XOSSF</em>' attribute.
	 * @see #setXOSSF(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGRLINERG_XOSSF()
	 * @model required="true"
	 * @generated
	 */
	Integer getXOSSF();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GRLINERG#getXOSSF <em>XOSSF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOSSF</em>' attribute.
	 * @see #getXOSSF()
	 * @generated
	 */
	void setXOSSF(Integer value);

	/**
	 * Returns the value of the '<em><b>YOFFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YOFFS</em>' attribute.
	 * @see #setYOFFS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGRLINERG_YOFFS()
	 * @model required="true"
	 * @generated
	 */
	Integer getYOFFS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GRLINERG#getYOFFS <em>YOFFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOFFS</em>' attribute.
	 * @see #getYOFFS()
	 * @generated
	 */
	void setYOFFS(Integer value);

} // GRLINERG
