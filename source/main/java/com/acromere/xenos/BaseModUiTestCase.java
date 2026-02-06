package com.acromere.xenos;

import com.acromere.product.ProductCard;
import com.acromere.xenon.Module;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseModUiTestCase<T extends Module> extends BaseFullXenonTestCase {

	private final Class<T> type;

	private Module module;

	protected BaseModUiTestCase( Class<T> type ) {
		this.type = type;
	}

	@BeforeEach
	protected void setup() throws Exception {
		super.setup();
		this.module = CommonModTestStuff.initMod( getProgram(), ProductCard.card( type ) );
	}

	protected Module getMod() {
		return module;
	}

}
