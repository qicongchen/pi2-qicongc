

/* First created by JCasGen Sun Sep 13 16:08:33 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** Include the Span and the Spans of tokens, bigrams and trigrams. 
 * Updated by JCasGen Sun Sep 13 18:03:51 EDT 2015
 * XML source: /Users/yuchenluo/git/pi2-qicongc/pi2-qicongc/src/main/resources/pi2-qicongc-typesystem.xml
 * @generated */
public class Text extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Text.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Text() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Text(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Text(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Span

  /** getter for Span - gets Span of this whole text.
   * @generated
   * @return value of the feature 
   */
  public Span getSpan() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Span == null)
      jcasType.jcas.throwFeatMissing("Span", "Text");
    return (Span)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Text_Type)jcasType).casFeatCode_Span)));}
    
  /** setter for Span - sets Span of this whole text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpan(Span v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Span == null)
      jcasType.jcas.throwFeatMissing("Span", "Text");
    jcasType.ll_cas.ll_setRefValue(addr, ((Text_Type)jcasType).casFeatCode_Span, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Tokens

  /** getter for Tokens - gets Spans of tokens.
   * @generated
   * @return value of the feature 
   */
  public FSList getTokens() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "Text");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Text_Type)jcasType).casFeatCode_Tokens)));}
    
  /** setter for Tokens - sets Spans of tokens. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSList v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "Text");
    jcasType.ll_cas.ll_setRefValue(addr, ((Text_Type)jcasType).casFeatCode_Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Bigrams

  /** getter for Bigrams - gets Spans of bigrams.
   * @generated
   * @return value of the feature 
   */
  public FSList getBigrams() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Bigrams == null)
      jcasType.jcas.throwFeatMissing("Bigrams", "Text");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Text_Type)jcasType).casFeatCode_Bigrams)));}
    
  /** setter for Bigrams - sets Spans of bigrams. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBigrams(FSList v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Bigrams == null)
      jcasType.jcas.throwFeatMissing("Bigrams", "Text");
    jcasType.ll_cas.ll_setRefValue(addr, ((Text_Type)jcasType).casFeatCode_Bigrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Trigrams

  /** getter for Trigrams - gets Spans of trigrams.
   * @generated
   * @return value of the feature 
   */
  public FSList getTrigrams() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Trigrams == null)
      jcasType.jcas.throwFeatMissing("Trigrams", "Text");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Text_Type)jcasType).casFeatCode_Trigrams)));}
    
  /** setter for Trigrams - sets Spans of trigrams. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrigrams(FSList v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_Trigrams == null)
      jcasType.jcas.throwFeatMissing("Trigrams", "Text");
    jcasType.ll_cas.ll_setRefValue(addr, ((Text_Type)jcasType).casFeatCode_Trigrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    