package org.uncle.lee.chainof.responsibility.pipeline.woman;

import org.uncle.lee.chainof.responsibility.pipeline.morality.AncientMorality;
import org.uncle.lee.chainof.responsibility.pipeline.morality.Morality;

public class AncientWoman extends Woman {
	@Override
	protected Morality initMorality() {
		return new AncientMorality();
	}
}
