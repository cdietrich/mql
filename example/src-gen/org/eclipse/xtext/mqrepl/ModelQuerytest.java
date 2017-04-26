package org.eclipse.xtext.mqrepl;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

@SuppressWarnings("all")
public class ModelQuerytest {
  private IResourceDescriptions index;
  
  private IProject project;
  
  private ResourceSet resourceSet;
  
  private Injector injector;
  
  public void main() throws Exception {
    this.upper("xxxx");
    this.project.getName();
    final Function2<EClass, Class<? extends EObject>, Iterable<? extends EObject>> _function = (EClass typ, Class<? extends EObject> typ2) -> {
      Iterable<? extends EObject> _xblockexpression = null;
      {
        final List<IEObjectDescription> eiods = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedObjectsByType(typ));
        final Function1<IEObjectDescription, EObject> _function_1 = (IEObjectDescription g) -> {
          return EcoreUtil.resolve(g.getEObjectOrProxy(), this.resourceSet);
        };
        final Iterable<? extends EObject> a = Iterables.filter(ListExtensions.<IEObjectDescription, EObject>map(eiods, _function_1), typ2);
        _xblockexpression = a;
      }
      return _xblockexpression;
    };
    Function2<EClass, Class<? extends EObject>, Iterable<? extends EObject>> alle2 = _function;
    final List<IEObjectDescription> mimimi = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedObjectsByType(MyDslPackage.Literals.ENTITY));
    mimimi.size();
    Iterable<? extends EObject> _apply = alle2.apply(MyDslPackage.Literals.ENTITY, Entity.class);
    final Iterable<Entity> entities = ((Iterable<Entity>) _apply);
    IterableExtensions.size(entities);
    final Function1<Entity, Boolean> _function_1 = (Entity e) -> {
      final Function1<Attribute, Boolean> _function_2 = (Attribute a) -> {
        String _name = a.getName();
        return Boolean.valueOf(Objects.equal(_name, "name"));
      };
      int _size = IterableExtensions.size(IterableExtensions.<Attribute>filter(Iterables.<Attribute>filter(e.getFeatures(), Attribute.class), _function_2));
      return Boolean.valueOf((_size == 0));
    };
    final Iterable<Entity> entitiesWithoutName = IterableExtensions.<Entity>filter(entities, _function_1);
    final Function1<Entity, String> _function_2 = (Entity e) -> {
      return e.getName();
    };
    IterableExtensions.<String>toList(IterableExtensions.<Entity, String>map(entitiesWithoutName, _function_2));
  }
  
  public <T extends Object> Iterable<T> alle(final EClass typ) {
    List<T> _xblockexpression = null;
    {
      final List<IEObjectDescription> eiods = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedObjectsByType(typ));
      final Function1<IEObjectDescription, T> _function = (IEObjectDescription g) -> {
        EObject _resolve = EcoreUtil.resolve(g.getEObjectOrProxy(), this.resourceSet);
        return ((T) _resolve);
      };
      final List<T> alle = ListExtensions.<IEObjectDescription, T>map(eiods, _function);
      _xblockexpression = alle;
    }
    return _xblockexpression;
  }
  
  public Iterable<Entity> alleEntities() {
    return this.<Entity>alle(MyDslPackage.Literals.ENTITY);
  }
  
  public String upper(final String s) {
    return s.toUpperCase();
  }
}
