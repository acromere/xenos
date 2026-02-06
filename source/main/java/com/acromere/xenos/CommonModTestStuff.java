package com.acromere.xenos;

import com.acromere.product.ProductCard;
import com.acromere.xenon.Module;
import com.acromere.xenon.Xenon;

import static org.assertj.core.api.Assertions.assertThat;

public interface CommonModTestStuff {

	static Module initMod( Xenon program, ProductCard card ) {
		Module module = program.getProductManager().getMod( card.getProductKey() );
		assertThat( module ).withFailMessage( "Module not found: " + card ).isNotNull();

		program.getProductManager().setModEnabled( card, true );
		assertThat( program.getProductManager().isEnabled( card ) ).withFailMessage( "Module not ready for testing: " + module ).isTrue();

		module.init( program, ProductCard.card( module ) );

		return module;
	}

}
