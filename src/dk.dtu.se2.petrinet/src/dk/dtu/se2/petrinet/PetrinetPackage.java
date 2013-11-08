/**
 */
package dk.dtu.se2.petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.se2.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = dk.dtu.se2.petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.ExtendedPetriNetImpl <em>Extended Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.ExtendedPetriNetImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getExtendedPetriNet()
	 * @generated
	 */
	int EXTENDED_PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>Extended Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PETRI_NET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.PlaceImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Geometry Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GEOMETRY_LABEL = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Animation Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ANIMATION_LABEL = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__APPEARANCE_LABEL = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Place Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INPUT_PLACE_LABEL = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.GeometryLabelImpl <em>Geometry Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.GeometryLabelImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getGeometryLabel()
	 * @generated
	 */
	int GEOMETRY_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LABEL__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LABEL__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LABEL__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LABEL__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LABEL_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.AnimationLabelImpl <em>Animation Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.AnimationLabelImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getAnimationLabel()
	 * @generated
	 */
	int ANIMATION_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Animation Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LABEL_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.AppearanceLabelImpl <em>Appearance Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.AppearanceLabelImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getAppearanceLabel()
	 * @generated
	 */
	int APPEARANCE_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_LABEL__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_LABEL__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_LABEL__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_LABEL__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Appearance Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_LABEL_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.TokenImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.ArcImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__IDENTITY = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.IdentityImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 7;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.petrinet.impl.InputPlaceImpl <em>Input Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.petrinet.impl.InputPlaceImpl
	 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getInputPlace()
	 * @generated
	 */
	int INPUT_PLACE = 8;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PLACE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PLACE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PLACE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PLACE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.ExtendedPetriNet <em>Extended Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Petri Net</em>'.
	 * @see dk.dtu.se2.petrinet.ExtendedPetriNet
	 * @generated
	 */
	EClass getExtendedPetriNet();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see dk.dtu.se2.petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.Place#getGeometryLabel <em>Geometry Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Label</em>'.
	 * @see dk.dtu.se2.petrinet.Place#getGeometryLabel()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_GeometryLabel();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.Place#getAnimationLabel <em>Animation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animation Label</em>'.
	 * @see dk.dtu.se2.petrinet.Place#getAnimationLabel()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_AnimationLabel();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.Place#getAppearanceLabel <em>Appearance Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance Label</em>'.
	 * @see dk.dtu.se2.petrinet.Place#getAppearanceLabel()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_AppearanceLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.se2.petrinet.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see dk.dtu.se2.petrinet.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Tokens();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.Place#getInputPlaceLabel <em>Input Place Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Place Label</em>'.
	 * @see dk.dtu.se2.petrinet.Place#getInputPlaceLabel()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InputPlaceLabel();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.GeometryLabel <em>Geometry Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Label</em>'.
	 * @see dk.dtu.se2.petrinet.GeometryLabel
	 * @generated
	 */
	EClass getGeometryLabel();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.petrinet.GeometryLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.se2.petrinet.GeometryLabel#getText()
	 * @see #getGeometryLabel()
	 * @generated
	 */
	EAttribute getGeometryLabel_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.AnimationLabel <em>Animation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Label</em>'.
	 * @see dk.dtu.se2.petrinet.AnimationLabel
	 * @generated
	 */
	EClass getAnimationLabel();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.AnimationLabel#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see dk.dtu.se2.petrinet.AnimationLabel#getStructure()
	 * @see #getAnimationLabel()
	 * @generated
	 */
	EReference getAnimationLabel_Structure();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.AppearanceLabel <em>Appearance Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance Label</em>'.
	 * @see dk.dtu.se2.petrinet.AppearanceLabel
	 * @generated
	 */
	EClass getAppearanceLabel();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.petrinet.AppearanceLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.se2.petrinet.AppearanceLabel#getText()
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	EAttribute getAppearanceLabel_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see dk.dtu.se2.petrinet.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.petrinet.Token#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.se2.petrinet.Token#getText()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see dk.dtu.se2.petrinet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.se2.petrinet.Arc#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identity</em>'.
	 * @see dk.dtu.se2.petrinet.Arc#getIdentity()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Identity();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see dk.dtu.se2.petrinet.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.petrinet.Identity#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.se2.petrinet.Identity#getText()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.petrinet.InputPlace <em>Input Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Place</em>'.
	 * @see dk.dtu.se2.petrinet.InputPlace
	 * @generated
	 */
	EClass getInputPlace();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.petrinet.InputPlace#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.se2.petrinet.InputPlace#getText()
	 * @see #getInputPlace()
	 * @generated
	 */
	EAttribute getInputPlace_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.ExtendedPetriNetImpl <em>Extended Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.ExtendedPetriNetImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getExtendedPetriNet()
		 * @generated
		 */
		EClass EXTENDED_PETRI_NET = eINSTANCE.getExtendedPetriNet();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.PlaceImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Geometry Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__GEOMETRY_LABEL = eINSTANCE.getPlace_GeometryLabel();

		/**
		 * The meta object literal for the '<em><b>Animation Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ANIMATION_LABEL = eINSTANCE.getPlace_AnimationLabel();

		/**
		 * The meta object literal for the '<em><b>Appearance Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__APPEARANCE_LABEL = eINSTANCE.getPlace_AppearanceLabel();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '<em><b>Input Place Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INPUT_PLACE_LABEL = eINSTANCE.getPlace_InputPlaceLabel();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.GeometryLabelImpl <em>Geometry Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.GeometryLabelImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getGeometryLabel()
		 * @generated
		 */
		EClass GEOMETRY_LABEL = eINSTANCE.getGeometryLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_LABEL__TEXT = eINSTANCE.getGeometryLabel_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.AnimationLabelImpl <em>Animation Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.AnimationLabelImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getAnimationLabel()
		 * @generated
		 */
		EClass ANIMATION_LABEL = eINSTANCE.getAnimationLabel();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATION_LABEL__STRUCTURE = eINSTANCE.getAnimationLabel_Structure();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.AppearanceLabelImpl <em>Appearance Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.AppearanceLabelImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getAppearanceLabel()
		 * @generated
		 */
		EClass APPEARANCE_LABEL = eINSTANCE.getAppearanceLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_LABEL__TEXT = eINSTANCE.getAppearanceLabel_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.TokenImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TEXT = eINSTANCE.getToken_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.ArcImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__IDENTITY = eINSTANCE.getArc_Identity();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.IdentityImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY__TEXT = eINSTANCE.getIdentity_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.petrinet.impl.InputPlaceImpl <em>Input Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.petrinet.impl.InputPlaceImpl
		 * @see dk.dtu.se2.petrinet.impl.PetrinetPackageImpl#getInputPlace()
		 * @generated
		 */
		EClass INPUT_PLACE = eINSTANCE.getInputPlace();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PLACE__TEXT = eINSTANCE.getInputPlace_Text();

	}

} //PetrinetPackage
