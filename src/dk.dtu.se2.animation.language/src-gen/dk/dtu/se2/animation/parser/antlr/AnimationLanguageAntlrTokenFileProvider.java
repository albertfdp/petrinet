/*
* generated by Xtext
*/
package dk.dtu.se2.animation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AnimationLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.tokens");
	}
}