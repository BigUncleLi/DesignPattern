package org.uncle.lee.composite;

import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class Leaf extends Component {
	private static final String TAG = Leaf.class.getSimpleName();

	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void showStucture() {
		LogUtils.d(TAG, "leaf : " + super.getName());
	}

	@Override
	public boolean add(Component component) {
		return false;
	}

	@Override
	public boolean remove(Component component) {
		return false;
	}
	
	@Override
	public List<Component> getChildren() {
		return null;
	}
}
