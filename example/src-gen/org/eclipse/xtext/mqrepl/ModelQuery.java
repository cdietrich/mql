package org.eclipse.xtext.mqrepl;

import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.Feature;
import org.xtext.example.mydsl.myDsl.MyDslPackage.Literals;

public class ModelQuery {
  private IResourceDescriptions index;
  
  private ResourceSet resourceSet;
  
  private Injector injector;
  
  public void main() throws Exception {
      Iterable<IEObjectDescription> _exportedObjectsByType = this.index.getExportedObjectsByType(Literals.ENTITY);
      List<IEObjectDescription> _list = IterableExtensions.<IEObjectDescription>toList(_exportedObjectsByType);
      final List<IEObjectDescription> eiods = _list;
      final Function1<IEObjectDescription,EObject> _function = new Function1<IEObjectDescription,EObject>() {
          public EObject apply(final IEObjectDescription g) {
            EObject _eObjectOrProxy = g.getEObjectOrProxy();
            EObject _resolve = EcoreUtil.resolve(_eObjectOrProxy, ModelQuery.this.resourceSet);
            return _resolve;
          }
        };
      List<EObject> _map = ListExtensions.<IEObjectDescription, EObject>map(eiods, _function);
      Iterable<Entity> _filter = IterableExtensions.<Entity>filter(_map, org.xtext.example.mydsl.myDsl.Entity.class);
      final Iterable<Entity> entities = _filter;
      final Function1<Entity,Boolean> _function_1 = new Function1<Entity,Boolean>() {
          public Boolean apply(final Entity e) {
            EList<Feature> _features = e.getFeatures();
            Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features, org.xtext.example.mydsl.myDsl.Attribute.class);
            final Function1<Attribute,Boolean> _function = new Function1<Attribute,Boolean>() {
                public Boolean apply(final Attribute a) {
                  String _name = a.getName();
                  boolean _operator_equals = ObjectExtensions.operator_equals(_name, "name");
                  return Boolean.valueOf(_operator_equals);
                }
              };
            Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(_filter, _function);
            int _size = IterableExtensions.size(_filter_1);
            boolean _operator_equals = IntegerExtensions.operator_equals(_size, 0);
            return Boolean.valueOf(_operator_equals);
          }
        };
      Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(entities, _function_1);
      final Iterable<Entity> entitiesWithoutName = _filter_1;
      final Function1<Entity,String> _function_2 = new Function1<Entity,String>() {
          public String apply(final Entity e) {
            String _name = e.getName();
            return _name;
          }
        };
      IterableExtensions.<Entity, String>map(entitiesWithoutName, _function_2);
  }
}
