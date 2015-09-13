
/* First created by JCasGen Sun Sep 13 15:13:50 EDT 2015 */

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

/** Include the Text, the correct label, and the score of an answer.
 * Updated by JCasGen Sun Sep 13 16:09:02 EDT 2015
 * @generated */
public class Answer_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_Correct;
  /** @generated */
  final int     casFeatCode_Correct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCorrect(int addr) {
        if (featOkTst && casFeat_Correct == null)
      jcas.throwFeatMissing("Correct", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_Correct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_Correct == null)
      jcas.throwFeatMissing("Correct", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_Correct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Text;
  /** @generated */
  final int     casFeatCode_Text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getText(int addr) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, int v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_Text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Correct = jcas.getRequiredFeatureDE(casType, "Correct", "uima.cas.Boolean", featOkTst);
    casFeatCode_Correct  = (null == casFeat_Correct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Correct).getCode();

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Double", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "Text", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

  }
}



    