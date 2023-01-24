package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Expression'", "':'", "'exists'", "'True'", "'if'", "'then'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Expression' otherlv_1= ':' ( (lv_exprs_2_0= ruleExpression ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Expression' otherlv_1= ':' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Expression' otherlv_1= ':' ( (lv_exprs_2_0= ruleExpression ) ) )*
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Expression' otherlv_1= ':' ( (lv_exprs_2_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: otherlv_0= 'Expression' otherlv_1= ':' ( (lv_exprs_2_0= ruleExpression ) )
            	    {
            	    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getExpressionKeyword_0());
            	      		
            	    }
            	    otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            	      		
            	    }
            	    // InternalMyDsl.g:87:3: ( (lv_exprs_2_0= ruleExpression ) )
            	    // InternalMyDsl.g:88:4: (lv_exprs_2_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:88:4: (lv_exprs_2_0= ruleExpression )
            	    // InternalMyDsl.g:89:5: lv_exprs_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getExprsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_exprs_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exprs",
            	      						lv_exprs_2_0,
            	      						"org.xtext.example.mydsl.MyDsl.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:110:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:110:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:111:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:117:1: ruleExpression returns [EObject current=null] : this_ExistsOperation_0= ruleExistsOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExistsOperation_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:123:2: (this_ExistsOperation_0= ruleExistsOperation )
            // InternalMyDsl.g:124:2: this_ExistsOperation_0= ruleExistsOperation
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getExistsOperationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExistsOperation_0=ruleExistsOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExistsOperation_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExistsOperation"
    // InternalMyDsl.g:135:1: entryRuleExistsOperation returns [EObject current=null] : iv_ruleExistsOperation= ruleExistsOperation EOF ;
    public final EObject entryRuleExistsOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsOperation = null;


        try {
            // InternalMyDsl.g:135:56: (iv_ruleExistsOperation= ruleExistsOperation EOF )
            // InternalMyDsl.g:136:2: iv_ruleExistsOperation= ruleExistsOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistsOperation=ruleExistsOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsOperation"


    // $ANTLR start "ruleExistsOperation"
    // InternalMyDsl.g:142:1: ruleExistsOperation returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )* ) ;
    public final EObject ruleExistsOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:148:2: ( (this_Primary_0= rulePrimary ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )* ) )
            // InternalMyDsl.g:149:2: (this_Primary_0= rulePrimary ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )* )
            {
            // InternalMyDsl.g:149:2: (this_Primary_0= rulePrimary ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )* )
            // InternalMyDsl.g:150:3: this_Primary_0= rulePrimary ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExistsOperationAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:158:3: ( ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_InternalMyDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:159:4: ( ( () 'exists' ) )=> ( () otherlv_2= 'exists' )
            	    {
            	    // InternalMyDsl.g:165:4: ( () otherlv_2= 'exists' )
            	    // InternalMyDsl.g:166:5: () otherlv_2= 'exists'
            	    {
            	    // InternalMyDsl.g:166:5: ()
            	    // InternalMyDsl.g:167:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExistsOperationAccess().getExistsOperationArgumentAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExistsOperationAccess().getExistsKeyword_1_0_1());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsOperation"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:183:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:183:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:184:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:190:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= 'True' ) | ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;

        EObject lv_then_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:196:2: ( ( ( () otherlv_1= 'True' ) | ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) ) ) )
            // InternalMyDsl.g:197:2: ( ( () otherlv_1= 'True' ) | ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) ) )
            {
            // InternalMyDsl.g:197:2: ( ( () otherlv_1= 'True' ) | ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:198:3: ( () otherlv_1= 'True' )
                    {
                    // InternalMyDsl.g:198:3: ( () otherlv_1= 'True' )
                    // InternalMyDsl.g:199:4: () otherlv_1= 'True'
                    {
                    // InternalMyDsl.g:199:4: ()
                    // InternalMyDsl.g:200:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getBooleanLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getTrueKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:212:3: ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:212:3: ( () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) ) )
                    // InternalMyDsl.g:213:4: () otherlv_3= 'if' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= 'then' ( (lv_then_6_0= ruleExpression ) )
                    {
                    // InternalMyDsl.g:213:4: ()
                    // InternalMyDsl.g:214:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getConditionalExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getIfKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:224:4: ( (lv_condition_4_0= ruleExpression ) )
                    // InternalMyDsl.g:225:5: (lv_condition_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:225:5: (lv_condition_4_0= ruleExpression )
                    // InternalMyDsl.g:226:6: lv_condition_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getConditionExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_condition_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_0,
                      							"org.xtext.example.mydsl.MyDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getThenKeyword_1_3());
                      			
                    }
                    // InternalMyDsl.g:247:4: ( (lv_then_6_0= ruleExpression ) )
                    // InternalMyDsl.g:248:5: (lv_then_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:248:5: (lv_then_6_0= ruleExpression )
                    // InternalMyDsl.g:249:6: lv_then_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getThenExpressionParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_then_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"then",
                      							lv_then_6_0,
                      							"org.xtext.example.mydsl.MyDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:159:4: ( ( () 'exists' ) )
        // InternalMyDsl.g:159:5: ( () 'exists' )
        {
        // InternalMyDsl.g:159:5: ( () 'exists' )
        // InternalMyDsl.g:160:5: () 'exists'
        {
        // InternalMyDsl.g:160:5: ()
        // InternalMyDsl.g:161:5: 
        {
        }

        match(input,13,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});

}