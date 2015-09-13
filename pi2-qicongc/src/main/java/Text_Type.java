
/* First created by JCasGen Sun Sep 13 16:08:33 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Include the Span and the Spans of tokens, bigrams and trigrams. 
 * Updated by JCasGen Sun Sep 13 18:03:51 EDT 2015
 * @generated */
public class Text_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Text_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Text_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Text(addr, Text_Type.this);
  			   Text_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Text(addr, Text_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Text.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Text");
 
  /** @generated */
  final Feature casFeat_Span;
  /** @generated */
  final int     casFeatCode_Span;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpan(int addr) {
        if (featOkTst && casFeat_Span == null)
      jcas.throwFeatMissing("Span", "Text");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Span);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpan(int addr, int v) {
        if (featOkTst && casFeat_Span == null)
      jcas.throwFeatMissing("Span", "Text");
    ll_cas.ll_setRefValue(addr, casFeatCode_Span, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Tokens;
  /** @generated */
  final int     casFeatCode_Tokens;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "Text");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Tokens);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "Text");
    ll_cas.ll_setRefValue(addr, casFeatCode_Tokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Bigrams;
  /** @generated */
  final int     casFeatCode_Bigrams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBigrams(int addr) {
        if (featOkTst && casFeat_Bigrams == null)
      jcas.throwFeatMissing("Bigrams", "Text");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Bigrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBigrams(int addr, int v) {
        if (featOkTst && casFeat_Bigrams == null)
      jcas.throwFeatMissing("Bigrams", "Text");
    ll_cas.ll_setRefValue(addr, casFeatCode_Bigrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Trigrams;
  /** @generated */
  final int     casFeatCode_Trigrams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTrigrams(int addr) {
        if (featOkTst && casFeat_Trigrams == null)
      jcas.throwFeatMissing("Trigrams", "Text");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Trigrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTrigrams(int addr, int v) {
        if (featOkTst && casFeat_Trigrams == null)
      jcas.throwFeatMissing("Trigrams", "Text");
    ll_cas.ll_setRefValue(addr, casFeatCode_Trigrams, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Text_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Span = jcas.getRequiredFeatureDE(casType, "Span", "Span", featOkTst);
    casFeatCode_Span  = (null == casFeat_Span) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Span).getCode();

 
    casFeat_Tokens = jcas.getRequiredFeatureDE(casType, "Tokens", "uima.cas.FSList", featOkTst);
    casFeatCode_Tokens  = (null == casFeat_Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tokens).getCode();

 
    casFeat_Bigrams = jcas.getRequiredFeatureDE(casType, "Bigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_Bigrams  = (null == casFeat_Bigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Bigrams).getCode();

 
    casFeat_Trigrams = jcas.getRequiredFeatureDE(casType, "Trigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_Trigrams  = (null == casFeat_Trigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Trigrams).getCode();

  }
}



    