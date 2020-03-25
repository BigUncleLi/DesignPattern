package org.uncle.lee.composite;

import java.util.ArrayList;
import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class Composite extends Component {
	private static final String TAG = Composite.class.getSimpleName();

	private List<Component> children;
	
	public Composite(String name) {
		super(name);
		children = new ArrayList<Component>();
	}
	
	@Override
	public void showStucture() {
		LogUtils.d(TAG, "composite : " + super.getName());
		if(isHasChildren()){
			showChildren(this);
		}
	}

	private boolean isHasChildren(){
		if(children.size() != 0){
			return true;
		}else {
			return false;
		}
	}
	
	private void showChildren(Composite composite) {
		for(Component child : composite.getChildren()){
			child.showStucture();
		}
	}

	@Override
	public boolean add(Component component) {
		if(!isChildExist(component)){
			children.add(component);
			return true;
		}else {
			return false;
		}
	}

	private boolean isChildExist(Component component) {
		for(Component child : children){
			if(child.equals(component)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Component component) {
		if(isChildExist(component)){
			children.remove(component);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Component> getChildren() {
		return children;
	}
}
