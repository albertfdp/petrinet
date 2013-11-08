/**
 */
package dk.dtu.se2.petrinet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

import dk.dtu.se2.animation.AnimationPackage;
import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.petrinet.AppearanceLabel;
import dk.dtu.se2.petrinet.Arc;
import dk.dtu.se2.petrinet.ExtendedPetriNet;
import dk.dtu.se2.petrinet.GeometryLabel;
import dk.dtu.se2.petrinet.Identity;
import dk.dtu.se2.petrinet.InputPlace;
import dk.dtu.se2.petrinet.PetrinetFactory;
import dk.dtu.se2.petrinet.PetrinetPackage;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetPackageImpl extends EPackageImpl implements PetrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPlaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetPackageImpl() {
		super(eNS_URI, PetrinetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PetrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetPackage init() {
		if (isInited) return (PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetPackage.eNS_URI);

		// Obtain or create and register package
		PetrinetPackageImpl thePetrinetPackage = (PetrinetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnimationPackage.eINSTANCE.eClass();
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePetrinetPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetPackage.eNS_URI, thePetrinetPackage);
		return thePetrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedPetriNet() {
		return extendedPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_GeometryLabel() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_AnimationLabel() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_AppearanceLabel() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Tokens() {
		return (EReference)placeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InputPlaceLabel() {
		return (EReference)placeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryLabel() {
		return geometryLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryLabel_Text() {
		return (EAttribute)geometryLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationLabel() {
		return animationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationLabel_Structure() {
		return (EReference)animationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearanceLabel() {
		return appearanceLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearanceLabel_Text() {
		return (EAttribute)appearanceLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Text() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Identity() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentity_Text() {
		return (EAttribute)identityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPlace() {
		return inputPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPlace_Text() {
		return (EAttribute)inputPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetFactory getPetrinetFactory() {
		return (PetrinetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		extendedPetriNetEClass = createEClass(EXTENDED_PETRI_NET);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__GEOMETRY_LABEL);
		createEReference(placeEClass, PLACE__ANIMATION_LABEL);
		createEReference(placeEClass, PLACE__APPEARANCE_LABEL);
		createEReference(placeEClass, PLACE__TOKENS);
		createEReference(placeEClass, PLACE__INPUT_PLACE_LABEL);

		geometryLabelEClass = createEClass(GEOMETRY_LABEL);
		createEAttribute(geometryLabelEClass, GEOMETRY_LABEL__TEXT);

		animationLabelEClass = createEClass(ANIMATION_LABEL);
		createEReference(animationLabelEClass, ANIMATION_LABEL__STRUCTURE);

		appearanceLabelEClass = createEClass(APPEARANCE_LABEL);
		createEAttribute(appearanceLabelEClass, APPEARANCE_LABEL__TEXT);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__IDENTITY);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__TEXT);

		inputPlaceEClass = createEClass(INPUT_PLACE);
		createEAttribute(inputPlaceEClass, INPUT_PLACE__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);
		AnimationPackage theAnimationPackage = (AnimationPackage)EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedPetriNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		geometryLabelEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		geometryLabelEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		animationLabelEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		appearanceLabelEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		tokenEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		identityEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		inputPlaceEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(extendedPetriNetEClass, ExtendedPetriNet.class, "ExtendedPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_GeometryLabel(), this.getGeometryLabel(), null, "geometryLabel", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_AnimationLabel(), this.getAnimationLabel(), null, "animationLabel", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_AppearanceLabel(), this.getAppearanceLabel(), null, "appearanceLabel", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_InputPlaceLabel(), this.getInputPlace(), null, "inputPlaceLabel", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryLabelEClass, GeometryLabel.class, "GeometryLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometryLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, GeometryLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationLabelEClass, AnimationLabel.class, "AnimationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimationLabel_Structure(), theAnimationPackage.getAnimation(), null, "structure", null, 1, 1, AnimationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceLabelEClass, AppearanceLabel.class, "AppearanceLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearanceLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, AppearanceLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Text(), ecorePackage.getEString(), "text", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Identity(), this.getIdentity(), null, "identity", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_Text(), ecorePackage.getEString(), "text", null, 0, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPlaceEClass, InputPlace.class, "InputPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPlace_Text(), ecorePackage.getEString(), "text", null, 0, 1, InputPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetrinetPackageImpl
