package org.nasdanika.models.bw6.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Link;

public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
    protected static final String NAME_EDEFAULT = null;

    protected FlowImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.FLOW;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.FLOW__NAME, Bw6Package.Literals.FLOW__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.FLOW__NAME, Bw6Package.Literals.FLOW__NAME, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Link> getLinks() {
        return (EList<Link>)eDynamicGet(Bw6Package.FLOW__LINKS, Bw6Package.Literals.FLOW__LINKS, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Activity> getActivities() {
        return (EList<Activity>)eDynamicGet(Bw6Package.FLOW__ACTIVITIES, Bw6Package.Literals.FLOW__ACTIVITIES, true, true);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.FLOW__NAME:
                return getName();
            case Bw6Package.FLOW__LINKS:
                return getLinks();
            case Bw6Package.FLOW__ACTIVITIES:
                return getActivities();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.FLOW__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.FLOW__LINKS:
                getLinks().clear();
                getLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case Bw6Package.FLOW__ACTIVITIES:
                getActivities().clear();
                getActivities().addAll((Collection<? extends Activity>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.FLOW__NAME:
                setName(null);
                return;
            case Bw6Package.FLOW__LINKS:
                getLinks().clear();
                return;
            case Bw6Package.FLOW__ACTIVITIES:
                getActivities().clear();
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.FLOW__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.FLOW__LINKS:
                return !getLinks().isEmpty();
            case Bw6Package.FLOW__ACTIVITIES:
                return !getActivities().isEmpty();
        }
        return super.eIsSet(featureID);
    }
}
