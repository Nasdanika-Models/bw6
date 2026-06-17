/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.Bw6Factory;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.EmptyActivity;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.ReceiveEvent;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;
import org.nasdanika.models.bw6.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bw6FactoryImpl extends EFactoryImpl implements Bw6Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bw6Factory init() {
		try {
			Bw6Factory theBw6Factory = (Bw6Factory)EPackage.Registry.INSTANCE.getEFactory(Bw6Package.eNS_URI);
			if (theBw6Factory != null) {
				return theBw6Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bw6FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bw6FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bw6Package.PROCESS: return createProcess();
			case Bw6Package.PROCESS_INFO: return createProcessInfo();
			case Bw6Package.PROCESS_INTERFACE: return createProcessInterface();
			case Bw6Package.IMPORT: return createImport();
			case Bw6Package.PARTNER_LINK: return createPartnerLink();
			case Bw6Package.VARIABLE: return createVariable();
			case Bw6Package.SCOPE: return createScope();
			case Bw6Package.FLOW: return createFlow();
			case Bw6Package.LINK: return createLink();
			case Bw6Package.SOURCE: return createSource();
			case Bw6Package.TARGET: return createTarget();
			case Bw6Package.ACTIVITY_EXTENSION: return createActivityExtension();
			case Bw6Package.RECEIVE_EVENT: return createReceiveEvent();
			case Bw6Package.EMPTY_ACTIVITY: return createEmptyActivity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.bw6.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessInfo createProcessInfo() {
		ProcessInfoImpl processInfo = new ProcessInfoImpl();
		return processInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessInterface createProcessInterface() {
		ProcessInterfaceImpl processInterface = new ProcessInterfaceImpl();
		return processInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartnerLink createPartnerLink() {
		PartnerLinkImpl partnerLink = new PartnerLinkImpl();
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityExtension createActivityExtension() {
		ActivityExtensionImpl activityExtension = new ActivityExtensionImpl();
		return activityExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiveEvent createReceiveEvent() {
		ReceiveEventImpl receiveEvent = new ReceiveEventImpl();
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyActivity createEmptyActivity() {
		EmptyActivityImpl emptyActivity = new EmptyActivityImpl();
		return emptyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bw6Package getBw6Package() {
		return (Bw6Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bw6Package getPackage() {
		return Bw6Package.eINSTANCE;
	}

} //Bw6FactoryImpl
