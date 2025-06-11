package org.javaturk.jp.ch23.classAccess;

import org.javaturk.jp.ch23.classAccess.x.*;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassA {
	ClassB b = new ClassB();
	
//  	ClassXX x;
	
//	Not visible! Package accessible!
	ClassZZ z;
}
