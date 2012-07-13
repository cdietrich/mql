package org.eclipse.xtext.mqrepl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.mqrepl.services.ModelQueryLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModelQueryLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "';'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalModelQueryLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelQueryLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelQueryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g"; }



     	private ModelQueryLanguageGrammarAccess grammarAccess;
     	
        public InternalModelQueryLanguageParser(TokenStream input, ModelQueryLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ModelQueryLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:98:3: ( (lv_body_1_0= ruleXBlockExpressionWithoutBraces ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:99:1: (lv_body_1_0= ruleXBlockExpressionWithoutBraces )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:99:1: (lv_body_1_0= ruleXBlockExpressionWithoutBraces )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:100:3: lv_body_1_0= ruleXBlockExpressionWithoutBraces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getBodyXBlockExpressionWithoutBracesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpressionWithoutBraces_in_ruleModel153);
            lv_body_1_0=ruleXBlockExpressionWithoutBraces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_1_0, 
                      		"XBlockExpressionWithoutBraces");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard294);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard352);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:191:1: (kw= '.' kw= '*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:192:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXBlockExpressionWithoutBraces"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:211:1: entryRuleXBlockExpressionWithoutBraces returns [EObject current=null] : iv_ruleXBlockExpressionWithoutBraces= ruleXBlockExpressionWithoutBraces EOF ;
    public final EObject entryRuleXBlockExpressionWithoutBraces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpressionWithoutBraces = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:212:2: (iv_ruleXBlockExpressionWithoutBraces= ruleXBlockExpressionWithoutBraces EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:213:2: iv_ruleXBlockExpressionWithoutBraces= ruleXBlockExpressionWithoutBraces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionWithoutBracesRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpressionWithoutBraces_in_entryRuleXBlockExpressionWithoutBraces426);
            iv_ruleXBlockExpressionWithoutBraces=ruleXBlockExpressionWithoutBraces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpressionWithoutBraces; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpressionWithoutBraces436); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpressionWithoutBraces"


    // $ANTLR start "ruleXBlockExpressionWithoutBraces"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:220:1: ruleXBlockExpressionWithoutBraces returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXBlockExpressionWithoutBraces() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:223:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:224:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:224:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:224:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:224:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:225:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionWithoutBracesAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:230:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||LA4_0==25||(LA4_0>=28 && LA4_0<=29)||LA4_0==33||LA4_0==38||LA4_0==40||LA4_0==43||LA4_0==45||LA4_0==47||(LA4_0>=51 && LA4_0<=56)||(LA4_0>=58 && LA4_0<=65)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:230:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:230:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:231:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:231:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:232:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionWithoutBracesAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpressionWithoutBraces492);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionWithoutBracesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:248:2: (otherlv_2= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:248:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpressionWithoutBraces505); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXBlockExpressionWithoutBracesAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleXBlockExpressionWithoutBraces"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:260:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:261:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:262:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression545);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression555); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:269:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:272:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:274:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression601);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:290:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:291:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:292:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment635);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment645); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:299:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:302:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_INT && LA6_1<=RULE_ID)||(LA6_1>=12 && LA6_1<=14)||(LA6_1>=16 && LA6_1<=40)||(LA6_1>=42 && LA6_1<=68)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==15) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==25||(LA6_0>=28 && LA6_0<=29)||LA6_0==33||LA6_0==38||LA6_0==40||LA6_0==43||LA6_0==45||LA6_0==47||(LA6_0>=51 && LA6_0<=53)||LA6_0==56||(LA6_0>=58 && LA6_0<=65)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:303:3: ()
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:304:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:309:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:310:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:310:1: ( ruleValidID )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:311:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment703);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment719);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:332:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:333:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:333:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:334:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment739);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:351:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:351:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:352:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment769);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalModelQueryLanguage()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:365:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:365:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:365:7: ()
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:366:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:371:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:372:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:372:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:373:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment822);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:386:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:387:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:387:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:388:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment845);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:412:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:413:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:414:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign885);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign896); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:421:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:424:28: (kw= '=' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:426:2: kw= '='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpSingleAssign933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:439:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:440:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:441:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign973);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign984); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:448:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:451:28: (kw= '+=' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:453:2: kw= '+='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMultiAssign1021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:466:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:467:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:468:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1060);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:475:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:478:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:479:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:479:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:480:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1117);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalModelQueryLanguage()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:493:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:493:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:493:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:494:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:499:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:500:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:500:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:501:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1170);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:514:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:515:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:515:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:516:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1193);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:540:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:541:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:542:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1232);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1243); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:549:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:552:28: (kw= '||' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:554:2: kw= '||'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpOr1280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:567:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:568:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:569:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1319);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:576:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:579:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:580:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:580:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:581:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1376);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalModelQueryLanguage()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:594:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:594:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:594:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:595:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:600:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:601:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:601:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:602:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1429);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:615:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:616:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:616:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:617:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1452);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:641:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:642:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:643:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1491);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1502); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:650:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:653:28: (kw= '&&' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:655:2: kw= '&&'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpAnd1539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:668:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:669:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:670:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1578);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:677:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:680:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:681:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:681:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:682:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1635);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalModelQueryLanguage()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==20) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalModelQueryLanguage()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:695:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:695:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:695:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:696:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:701:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:702:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:702:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:703:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1688);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:716:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:717:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:717:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:718:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1711);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:742:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:743:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:744:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1750);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1761); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:751:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:754:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:755:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:755:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:756:2: kw= '=='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:763:2: kw= '!='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:776:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:777:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:778:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1858);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:785:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:788:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:789:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:789:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:790:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1915);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred5_InternalModelQueryLanguage()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalModelQueryLanguage()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred6_InternalModelQueryLanguage()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalModelQueryLanguage()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalModelQueryLanguage()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:800:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:800:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:800:6: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXRelationalExpression1951); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:810:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:811:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:811:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:812:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1976);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:831:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:831:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:831:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:832:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:837:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:838:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:838:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:839:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2037);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:852:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:853:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:853:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:854:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2060);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:878:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:879:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:880:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2100);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2111); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:887:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:890:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:891:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:891:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:892:2: kw= '>='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare2149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:899:2: kw= '<='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:906:2: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:913:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:926:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:927:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:928:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2246);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:935:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:938:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:939:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:939:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:940:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2303);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalModelQueryLanguage()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==27) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalModelQueryLanguage()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:953:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:953:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:953:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:954:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:959:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:960:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:960:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:961:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2356);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:974:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:975:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:975:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:976:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2379);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1000:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1001:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1002:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2418);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2429); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1009:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1012:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1013:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1013:1: (kw= '->' | kw= '..' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1014:2: kw= '->'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1021:2: kw= '..'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1034:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1035:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1036:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2526);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1043:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1046:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1047:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1047:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1048:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2583);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred8_InternalModelQueryLanguage()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==29) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred8_InternalModelQueryLanguage()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1061:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1061:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1061:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1062:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1067:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1068:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1068:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1069:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2636);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1082:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1083:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1083:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1084:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2659);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1108:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1109:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1110:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2698);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2709); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1117:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1120:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1121:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1121:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1122:2: kw= '+'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpAdd2747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1129:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAdd2766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1142:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1143:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1144:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2806);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2816); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1151:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1154:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1155:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1155:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1156:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2863);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred9_InternalModelQueryLanguage()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred9_InternalModelQueryLanguage()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred9_InternalModelQueryLanguage()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred9_InternalModelQueryLanguage()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1169:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1169:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1169:7: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1170:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1175:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1176:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1176:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1177:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2916);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1190:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1191:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1191:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1192:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2939);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1216:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1217:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1218:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2978);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti2989); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1225:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1228:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1229:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1229:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1230:2: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOpMulti3027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1237:2: kw= '**'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMulti3046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1244:2: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1251:2: kw= '%'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1264:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1265:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1266:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3124);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3134); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1273:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1276:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=28 && LA19_0<=29)||LA19_0==33) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_ID)||LA19_0==25||LA19_0==38||LA19_0==40||LA19_0==43||LA19_0==45||LA19_0==47||(LA19_0>=51 && LA19_0<=53)||LA19_0==56||(LA19_0>=58 && LA19_0<=65)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1277:3: ()
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1278:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1283:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1284:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1284:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1285:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3192);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1298:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1299:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1299:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1300:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3213);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1318:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3242);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1334:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1335:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1336:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3278);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1343:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1346:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1347:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1347:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1348:2: kw= '!'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1355:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpUnary3346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1362:2: kw= '+'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpUnary3365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1375:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1376:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1377:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3405);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1384:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1387:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1388:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1388:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1389:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3462);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalModelQueryLanguage()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1399:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1399:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1399:6: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1400:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXCastedExpression3497); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1409:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1410:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1410:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1411:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3520);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1435:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1436:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1437:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3558);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1444:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1447:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1448:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1448:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1449:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3615);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred11_InternalModelQueryLanguage()) ) {
                        alt29=1;
                    }
                    else if ( (synpred12_InternalModelQueryLanguage()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred12_InternalModelQueryLanguage()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred12_InternalModelQueryLanguage()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1463:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1463:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1463:26: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall3664); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1473:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1474:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1474:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1475:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3687);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3703);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1496:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1497:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1497:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1498:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3725);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1531:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1531:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1531:8: ()
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1532:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1537:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1537:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall3811); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1542:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1542:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1543:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1543:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1544:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall3835); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1558:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1558:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1559:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1559:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1560:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3872); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1573:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==25) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1573:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3901); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1577:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1578:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1578:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1579:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3922);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1595:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==37) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1595:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall3935); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1599:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1600:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1600:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1601:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3956);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3970); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1621:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1622:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1622:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1623:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3995);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1636:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1636:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1636:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1636:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1643:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1644:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4029); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1674:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1675:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4114);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1692:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1692:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1692:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1692:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1693:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1693:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1694:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4142);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1710:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==37) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1710:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4155); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1714:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1715:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1715:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1716:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4176);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4193); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1736:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1736:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1741:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1742:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4226);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1766:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1767:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1768:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4266);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1775:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1778:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1779:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1779:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 45:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case 25:
            case 56:
                {
                alt30=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 40:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt30=5;
                }
                break;
            case 43:
                {
                alt30=6;
                }
                break;
            case 51:
                {
                alt30=7;
                }
                break;
            case 52:
                {
                alt30=8;
                }
                break;
            case 53:
                {
                alt30=9;
                }
                break;
            case 63:
                {
                alt30=10;
                }
                break;
            case 64:
                {
                alt30=11;
                }
                break;
            case 65:
                {
                alt30=12;
                }
                break;
            case 38:
                {
                alt30=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1780:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4323);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1790:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4350);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1800:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4377);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1810:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4404);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1820:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4431);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1830:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4458);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1840:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4485);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1850:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4512);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1860:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4539);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1870:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4566);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1880:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4593);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1890:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4620);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1900:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4647);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1916:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1917:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1918:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4682);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4692); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1925:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1928:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1929:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1929:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt31=1;
                }
                break;
            case 59:
            case 60:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case 61:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
                {
                alt31=5;
                }
                break;
            case 62:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1930:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4739);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1940:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4766);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1950:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4793);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1960:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4820);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1970:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4847);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1980:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4874);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1996:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1997:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1998:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4909);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4919); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2005:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2008:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2009:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2009:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2009:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2009:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2010:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXClosure4965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2034:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2034:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2034:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==38||LA33_0==68) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2034:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2034:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2035:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2035:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2036:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5036);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2052:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==37) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2052:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXClosure5049); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2056:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2057:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2057:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2058:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5070);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2074:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2075:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2075:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2076:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2089:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2090:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2090:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2091:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5129);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2119:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2120:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2121:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5177);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2128:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2131:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2132:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2132:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2132:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2132:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2133:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2138:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_ID)||LA36_0==25||(LA36_0>=28 && LA36_0<=29)||LA36_0==33||LA36_0==38||LA36_0==40||LA36_0==43||LA36_0==45||LA36_0==47||(LA36_0>=51 && LA36_0<=56)||(LA36_0>=58 && LA36_0<=65)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2138:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2138:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2139:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2139:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2140:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5243);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2156:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2156:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXExpressionInClosure5256); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2168:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2169:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2170:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5296);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2177:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2180:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2181:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2181:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2181:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2181:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2181:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2197:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2197:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2197:7: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2198:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2203:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==38||LA38_0==68) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2203:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2203:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2204:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2204:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2205:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5414);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2221:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==37) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2221:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXShortClosure5427); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2225:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2226:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2226:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2227:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5448);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2243:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2244:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2244:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2245:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2258:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2259:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2259:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2260:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5506);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2284:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2285:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2286:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5542);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5552); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2293:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2296:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2297:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2297:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2297:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXParenthesizedExpression5589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5611);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXParenthesizedExpression5622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2322:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2323:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2324:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5658);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2331:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2334:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2335:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2335:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2335:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2335:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXIfExpression5726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2349:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2350:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2350:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2351:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5747);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXIfExpression5759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2371:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2372:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2372:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2373:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5780);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred18_InternalModelQueryLanguage()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2394:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2395:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2395:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2396:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5823);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2420:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2421:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2422:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5861);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5871); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2429:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2432:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2433:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2433:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2433:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2433:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2434:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression5917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==46) && (synpred19_InternalModelQueryLanguage())) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2448:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2448:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2448:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2449:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2449:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2450:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5958);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression5970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2470:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2471:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2471:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2472:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5994);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2492:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==38||LA41_0==46||LA41_0==50||LA41_0==68) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2493:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2493:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2494:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6027);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2510:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2510:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2518:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2519:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2519:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2520:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6074);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2548:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2549:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2550:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6124);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6134); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2557:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2560:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2561:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2561:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2561:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2561:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==38||LA43_0==68) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2562:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2562:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2563:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6180);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2579:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2579:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2583:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2584:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2584:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2585:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6215);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXCasePart6229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2605:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2606:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2606:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2607:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6250);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2631:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2632:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2633:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6286);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6296); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2640:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2643:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2644:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2644:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2644:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2644:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2645:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXForLoopExpression6354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2658:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2659:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2659:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2660:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6375);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2680:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2681:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2681:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2682:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6408);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXForLoopExpression6420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2702:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2703:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2703:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2704:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6441);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2728:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2729:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2730:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6477);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6487); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2737:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2740:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2741:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2741:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2741:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2741:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXWhileExpression6533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXWhileExpression6545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2755:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2756:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2756:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2757:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6566);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXWhileExpression6578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2777:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2778:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2778:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2779:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6599);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2803:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2804:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2805:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6635);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6645); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2812:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2815:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2816:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2816:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2816:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2816:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2817:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression6691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2826:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2827:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2827:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2828:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6712);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression6724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXDoWhileExpression6736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2852:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2853:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2853:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2854:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6757);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXDoWhileExpression6769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2882:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2883:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2884:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6805);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6815); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2891:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2894:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2895:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2895:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2895:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2895:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression6861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2905:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_ID)||LA46_0==25||(LA46_0>=28 && LA46_0<=29)||LA46_0==33||LA46_0==38||LA46_0==40||LA46_0==43||LA46_0==45||LA46_0==47||(LA46_0>=51 && LA46_0<=56)||(LA46_0>=58 && LA46_0<=65)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2905:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2905:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2906:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2906:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2907:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6883);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2923:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==14) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2923:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression6896); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2939:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2940:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2941:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6948);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2948:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2951:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2952:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2952:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=54 && LA47_0<=55)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_INT && LA47_0<=RULE_ID)||LA47_0==25||(LA47_0>=28 && LA47_0<=29)||LA47_0==33||LA47_0==38||LA47_0==40||LA47_0==43||LA47_0==45||LA47_0==47||(LA47_0>=51 && LA47_0<=53)||LA47_0==56||(LA47_0>=58 && LA47_0<=65)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2953:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7005);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2963:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7032);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2979:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2980:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2981:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7067);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2988:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2991:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2992:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2992:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2992:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2992:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2993:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2998:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            else if ( (LA48_0==55) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2998:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2998:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2999:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2999:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3000:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,54,FOLLOW_54_in_ruleXVariableDeclaration7130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3014:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXVariableDeclaration7161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred20_InternalModelQueryLanguage()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==38) && (synpred20_InternalModelQueryLanguage())) {
                alt49=1;
            }
            else if ( (LA49_0==68) && (synpred20_InternalModelQueryLanguage())) {
                alt49=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3026:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3026:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3026:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3027:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3027:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3028:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7209);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3044:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3045:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3045:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3046:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7230);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3063:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3063:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3064:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3064:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3065:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7259);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3081:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3081:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXVariableDeclaration7273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3085:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3086:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3086:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3087:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7294);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3111:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3112:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3113:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7332);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7342); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3120:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3123:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3124:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3124:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3124:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3124:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==12||LA51_1==25||LA51_1==40) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==38||LA51_0==68) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3125:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3125:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3126:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7388);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3142:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3143:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3143:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3144:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7410);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3168:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3169:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3170:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7446);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3177:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3180:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3181:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3181:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3181:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3181:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3182:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3182:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3183:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7502);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3199:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3200:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3200:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3201:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7523);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3225:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3226:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3227:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7559);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7569); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3234:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3237:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3238:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3238:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3238:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3238:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3239:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3244:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==57) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3245:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3245:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3246:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7626);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3259:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3259:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3263:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3264:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3264:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3265:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7661);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3281:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==37) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3281:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7674); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3285:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3286:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3286:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3287:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7695);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3307:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3308:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3308:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3309:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7734);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3322:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3322:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3322:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3322:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3329:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3330:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall7768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3360:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3361:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7853);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3378:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3378:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3378:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3378:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3379:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3379:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3380:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7881);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3396:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==37) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3396:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7894); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3400:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3401:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3401:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3402:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7915);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3422:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3422:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3427:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3428:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall7965);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3452:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3453:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3454:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8003);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8014); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3461:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3464:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3465:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3465:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==56) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3466:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8061);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3478:2: kw= 'super'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleIdOrSuper8085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3491:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3492:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3493:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8126);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8137); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3500:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3503:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3504:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3504:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==57) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3505:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8184);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleStaticQualifier8202); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3529:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3530:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3531:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8243);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3538:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3541:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3542:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3542:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3542:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3542:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3543:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXConstructorCall8299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3552:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3553:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3553:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3554:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8322);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3567:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==25) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3567:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3571:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3572:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3572:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3573:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8356);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3589:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==37) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3589:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8369); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3593:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3594:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3594:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3595:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8390);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall8418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3636:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3637:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8490);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3654:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3654:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3654:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3654:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3655:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3655:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3656:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8518);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3672:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==37) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3672:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8531); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3676:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3677:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3677:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3678:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8552);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3698:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3698:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3703:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3704:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8600);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3728:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3729:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3730:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8637);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8647); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3737:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3740:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3741:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3741:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3741:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3741:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3747:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            else if ( (LA66_0==60) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3747:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXBooleanLiteral8694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3752:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3752:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3753:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3753:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3754:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,60,FOLLOW_60_in_ruleXBooleanLiteral8718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3775:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3776:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3777:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8768);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8778); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3784:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3787:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3788:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3788:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3788:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3788:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3789:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXNullLiteral8824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3806:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3807:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3808:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8860);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8870); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3815:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3818:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3819:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3819:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3819:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3819:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3820:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3825:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3826:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3826:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3827:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3851:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3852:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3853:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8962);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8972); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3860:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3863:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3864:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3864:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3864:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3864:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3865:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3870:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3871:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3871:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3872:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3896:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3897:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3898:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9064);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9074); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3905:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3908:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3909:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3909:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3909:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3909:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3910:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXTypeLiteral9120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXTypeLiteral9132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3923:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3924:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3924:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3925:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXTypeLiteral9167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3950:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3951:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3952:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9203);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9213); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3959:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3962:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3963:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3963:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3963:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3963:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3964:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXThrowExpression9259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3973:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3974:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3974:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3975:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9280);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3999:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4000:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4001:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9316);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4008:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4011:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4012:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4012:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4012:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4012:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4013:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXReturnExpression9372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4022:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4022:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4027:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4028:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9403);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4052:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4053:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4054:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9440);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4061:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4064:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4065:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4065:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4065:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4065:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4066:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTryCatchFinallyExpression9496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4075:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4076:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4076:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4077:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9517);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==67) ) {
                alt70=1;
            }
            else if ( (LA70_0==66) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==67) ) {
                            int LA68_2 = input.LA(2);

                            if ( (synpred27_InternalModelQueryLanguage()) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4095:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4096:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9547);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==66) ) {
                        int LA69_1 = input.LA(2);

                        if ( (synpred28_InternalModelQueryLanguage()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression9569); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4117:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4118:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4118:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4119:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9591);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4136:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4136:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4136:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression9613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4140:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4141:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4141:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4142:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9634);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4166:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4167:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4168:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9672);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9682); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4175:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4178:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4179:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4179:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4179:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4179:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4179:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleXCatchClause9727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleXCatchClause9740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4188:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4189:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4189:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4190:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9761);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXCatchClause9773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4210:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4211:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4211:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4212:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9794);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4236:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4237:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4238:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9831);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9842); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4245:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4248:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4249:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4249:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4250:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9889);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4260:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==12) ) {
                    int LA71_1 = input.LA(2);

                    if ( (LA71_1==RULE_ID) ) {
                        int LA71_3 = input.LA(3);

                        if ( (synpred30_InternalModelQueryLanguage()) ) {
                            alt71=1;
                        }


                    }


                }


                switch (alt71) {
            	case 1 :
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4260:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4260:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4260:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName9917); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9940);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4287:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4288:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4289:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9987);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4296:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4299:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4300:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4300:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==38||LA73_0==68) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4300:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4300:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4301:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10045);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==40) ) {
                            int LA72_2 = input.LA(2);

                            if ( (LA72_2==42) ) {
                                int LA72_3 = input.LA(3);

                                if ( (synpred31_InternalModelQueryLanguage()) ) {
                                    alt72=1;
                                }


                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4312:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4312:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4312:6: ()
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4313:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleJvmTypeReference10083); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmTypeReference10095); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4328:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10127);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4344:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4345:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4346:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10162);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10172); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4353:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4356:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4357:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4357:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4357:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4357:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4357:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef10210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4361:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_ID||LA75_0==38||LA75_0==68) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4361:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4361:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4362:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4362:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4363:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10232);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4379:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==37) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4379:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFunctionTypeRef10245); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4383:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4384:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4384:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4385:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10266);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef10282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleXFunctionTypeRef10296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4409:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4410:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4410:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4411:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10317);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4435:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4436:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4437:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10353);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10363); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4444:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4447:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4448:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4448:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4448:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4448:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4449:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4449:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4450:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10411);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4468:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4469:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4469:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4470:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10454);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4486:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==37) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4486:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference10467); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4490:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4491:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4491:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4492:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10488);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4520:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4521:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4522:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10540);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4529:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4532:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4533:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4533:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||LA79_0==38||LA79_0==68) ) {
                alt79=1;
            }
            else if ( (LA79_0==69) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4534:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10597);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4544:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10624);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4560:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4561:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4562:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10659);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10669); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4569:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4572:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4573:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4573:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4573:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4573:2: ()
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4574:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleJvmWildcardTypeReference10715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4583:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            else if ( (LA80_0==56) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4583:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4583:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4584:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4584:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4585:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10737);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4602:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4602:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4603:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4603:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4604:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10764);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4628:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4629:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4630:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10802);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10812); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4637:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4640:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4641:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4641:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4641:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleJvmUpperBound10849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4645:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4646:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4646:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4647:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10870);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4671:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4672:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4673:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10906);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4680:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4683:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4684:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4684:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4684:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleJvmUpperBoundAnded10953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4688:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4689:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4689:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4690:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10974);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4714:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4715:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4716:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11010);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11020); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4723:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4726:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4727:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4727:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4727:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleJvmLowerBound11057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4731:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4732:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4732:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4733:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11078);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4759:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4760:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4761:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11117);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11128); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4768:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4771:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4772:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalModelQueryLanguage
    public final void synpred1_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:360:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:361:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:361:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:362:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:362:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:363:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalModelQueryLanguage790);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalModelQueryLanguage

    // $ANTLR start synpred2_InternalModelQueryLanguage
    public final void synpred2_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:488:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:489:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:489:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:490:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:490:1: ( ruleOpOr )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:491:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalModelQueryLanguage1138);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalModelQueryLanguage

    // $ANTLR start synpred3_InternalModelQueryLanguage
    public final void synpred3_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:589:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:590:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:590:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:591:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:591:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:592:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalModelQueryLanguage1397);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalModelQueryLanguage

    // $ANTLR start synpred4_InternalModelQueryLanguage
    public final void synpred4_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:690:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:691:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:691:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:692:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:692:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:693:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalModelQueryLanguage1656);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalModelQueryLanguage

    // $ANTLR start synpred5_InternalModelQueryLanguage
    public final void synpred5_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:798:6: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:799:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred5_InternalModelQueryLanguage1932); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalModelQueryLanguage

    // $ANTLR start synpred6_InternalModelQueryLanguage
    public final void synpred6_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:826:10: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:827:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:827:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:828:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:828:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:829:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalModelQueryLanguage2005);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalModelQueryLanguage

    // $ANTLR start synpred7_InternalModelQueryLanguage
    public final void synpred7_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:948:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:949:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:949:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:950:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:950:1: ( ruleOpOther )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:951:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalModelQueryLanguage2324);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalModelQueryLanguage

    // $ANTLR start synpred8_InternalModelQueryLanguage
    public final void synpred8_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1056:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1057:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1057:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1058:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1058:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1059:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalModelQueryLanguage2604);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalModelQueryLanguage

    // $ANTLR start synpred9_InternalModelQueryLanguage
    public final void synpred9_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1164:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1165:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1165:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1166:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1166:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1167:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalModelQueryLanguage2884);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalModelQueryLanguage

    // $ANTLR start synpred10_InternalModelQueryLanguage
    public final void synpred10_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:4: ( () 'as' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:5: () 'as'
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1397:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1398:1: 
        {
        }

        match(input,34,FOLLOW_34_in_synpred10_InternalModelQueryLanguage3478); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalModelQueryLanguage

    // $ANTLR start synpred11_InternalModelQueryLanguage
    public final void synpred11_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1457:6: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1458:1: 
        {
        }

        match(input,12,FOLLOW_12_in_synpred11_InternalModelQueryLanguage3632); if (state.failed) return ;
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1459:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1460:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1460:1: ( ruleValidID )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1461:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalModelQueryLanguage3641);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalModelQueryLanguage3647);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalModelQueryLanguage

    // $ANTLR start synpred12_InternalModelQueryLanguage
    public final void synpred12_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1515:10: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1516:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1516:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt81=3;
        switch ( input.LA(1) ) {
        case 12:
            {
            alt81=1;
            }
            break;
        case 35:
            {
            alt81=2;
            }
            break;
        case 36:
            {
            alt81=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 81, 0, input);

            throw nvae;
        }

        switch (alt81) {
            case 1 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1516:4: '.'
                {
                match(input,12,FOLLOW_12_in_synpred12_InternalModelQueryLanguage3750); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1518:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1518:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1519:1: ( '?.' )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1519:1: ( '?.' )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1520:2: '?.'
                {
                match(input,35,FOLLOW_35_in_synpred12_InternalModelQueryLanguage3764); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1525:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1525:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1526:1: ( '*.' )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1526:1: ( '*.' )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1527:2: '*.'
                {
                match(input,36,FOLLOW_36_in_synpred12_InternalModelQueryLanguage3784); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalModelQueryLanguage

    // $ANTLR start synpred13_InternalModelQueryLanguage
    public final void synpred13_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1636:4: ( ( '(' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1637:1: ( '(' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1637:1: ( '(' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1638:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred13_InternalModelQueryLanguage4011); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalModelQueryLanguage

    // $ANTLR start synpred14_InternalModelQueryLanguage
    public final void synpred14_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1657:6: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1658:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1658:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_ID||LA83_0==38||LA83_0==68) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1658:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1658:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1659:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1659:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1660:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalModelQueryLanguage4063);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1662:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==37) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1662:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred14_InternalModelQueryLanguage4070); if (state.failed) return ;
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1663:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1664:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1664:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1665:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalModelQueryLanguage4077);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1667:6: ( ( '|' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1668:1: ( '|' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1668:1: ( '|' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1669:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred14_InternalModelQueryLanguage4091); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalModelQueryLanguage

    // $ANTLR start synpred15_InternalModelQueryLanguage
    public final void synpred15_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1736:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1737:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1737:1: ( ruleXClosure )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:1738:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalModelQueryLanguage4209);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalModelQueryLanguage

    // $ANTLR start synpred16_InternalModelQueryLanguage
    public final void synpred16_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==RULE_ID||LA85_0==38||LA85_0==68) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2019:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2020:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2020:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2021:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalModelQueryLanguage4982);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2023:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==37) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2023:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred16_InternalModelQueryLanguage4989); if (state.failed) return ;
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2024:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2025:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2025:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2026:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalModelQueryLanguage4996);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2028:6: ( ( '|' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2029:1: ( '|' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2029:1: ( '|' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2030:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred16_InternalModelQueryLanguage5010); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalModelQueryLanguage

    // $ANTLR start synpred18_InternalModelQueryLanguage
    public final void synpred18_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:4: ( 'else' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2389:6: 'else'
        {
        match(input,44,FOLLOW_44_in_synpred18_InternalModelQueryLanguage5793); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalModelQueryLanguage

    // $ANTLR start synpred19_InternalModelQueryLanguage
    public final void synpred19_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2443:4: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2444:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2444:1: ( ruleValidID )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:2445:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalModelQueryLanguage5933);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,46,FOLLOW_46_in_synpred19_InternalModelQueryLanguage5939); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalModelQueryLanguage

    // $ANTLR start synpred20_InternalModelQueryLanguage
    public final void synpred20_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3018:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3019:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3019:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3020:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalModelQueryLanguage7179);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3022:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3023:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3023:1: ( ruleValidID )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3024:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalModelQueryLanguage7188);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalModelQueryLanguage

    // $ANTLR start synpred21_InternalModelQueryLanguage
    public final void synpred21_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3322:4: ( ( '(' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3323:1: ( '(' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3323:1: ( '(' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3324:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred21_InternalModelQueryLanguage7750); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalModelQueryLanguage

    // $ANTLR start synpred22_InternalModelQueryLanguage
    public final void synpred22_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3343:6: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3344:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3344:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==38||LA89_0==68) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3344:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3344:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3345:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3345:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3346:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalModelQueryLanguage7802);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3348:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==37) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3348:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred22_InternalModelQueryLanguage7809); if (state.failed) return ;
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3349:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3350:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3350:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3351:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalModelQueryLanguage7816);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3353:6: ( ( '|' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3354:1: ( '|' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3354:1: ( '|' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3355:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred22_InternalModelQueryLanguage7830); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalModelQueryLanguage

    // $ANTLR start synpred23_InternalModelQueryLanguage
    public final void synpred23_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3422:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3423:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3423:1: ( ruleXClosure )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3424:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalModelQueryLanguage7948);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalModelQueryLanguage

    // $ANTLR start synpred24_InternalModelQueryLanguage
    public final void synpred24_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3619:5: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3620:1: 
        {
        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3620:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==38||LA91_0==68) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3620:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3620:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3621:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3621:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3622:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalModelQueryLanguage8439);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3624:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==37) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3624:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred24_InternalModelQueryLanguage8446); if (state.failed) return ;
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3625:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3626:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3626:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3627:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalModelQueryLanguage8453);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3629:6: ( ( '|' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3630:1: ( '|' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3630:1: ( '|' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3631:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred24_InternalModelQueryLanguage8467); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalModelQueryLanguage

    // $ANTLR start synpred25_InternalModelQueryLanguage
    public final void synpred25_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3698:2: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3699:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3699:1: ( ruleXClosure )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:3700:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalModelQueryLanguage8583);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalModelQueryLanguage

    // $ANTLR start synpred26_InternalModelQueryLanguage
    public final void synpred26_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4022:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4023:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4023:1: ( ruleXExpression )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4024:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalModelQueryLanguage9386);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalModelQueryLanguage

    // $ANTLR start synpred27_InternalModelQueryLanguage
    public final void synpred27_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:5: ( 'catch' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4093:7: 'catch'
        {
        match(input,67,FOLLOW_67_in_synpred27_InternalModelQueryLanguage9531); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalModelQueryLanguage

    // $ANTLR start synpred28_InternalModelQueryLanguage
    public final void synpred28_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:5: ( 'finally' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4112:7: 'finally'
        {
        match(input,66,FOLLOW_66_in_synpred28_InternalModelQueryLanguage9561); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalModelQueryLanguage

    // $ANTLR start synpred30_InternalModelQueryLanguage
    public final void synpred30_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4260:3: ( '.' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4261:2: '.'
        {
        match(input,12,FOLLOW_12_in_synpred30_InternalModelQueryLanguage9908); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalModelQueryLanguage

    // $ANTLR start synpred31_InternalModelQueryLanguage
    public final void synpred31_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:3: ( () '[' ']' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:4: () '[' ']'
        {
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4309:4: ()
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4310:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred31_InternalModelQueryLanguage10060); if (state.failed) return ;
        match(input,42,FOLLOW_42_in_synpred31_InternalModelQueryLanguage10064); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalModelQueryLanguage

    // $ANTLR start synpred32_InternalModelQueryLanguage
    public final void synpred32_InternalModelQueryLanguage_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:4: ( '<' )
        // ../org.eclipse.xtext.mql/src-gen/org/eclipse/xtext/mqrepl/parser/antlr/internal/InternalModelQueryLanguage.g:4463:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred32_InternalModelQueryLanguage10424); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalModelQueryLanguage

    // Delegated rules

    public final boolean synpred5_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalModelQueryLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalModelQueryLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA27_eotS =
        "\74\uffff";
    static final String DFA27_eofS =
        "\1\2\73\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA27_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\26\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1636:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\34\uffff";
    static final String DFA26_eofS =
        "\34\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA26_maxS =
        "\1\104\2\0\31\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\5\1\1\22\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1657:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==38) ) {s = 2;}

                        else if ( (LA26_0==68) && (synpred14_InternalModelQueryLanguage())) {s = 3;}

                        else if ( (LA26_0==41) && (synpred14_InternalModelQueryLanguage())) {s = 4;}

                        else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==25||(LA26_0>=28 && LA26_0<=29)||LA26_0==33||LA26_0==40||LA26_0==43||LA26_0==45||LA26_0==47||(LA26_0>=51 && LA26_0<=53)||LA26_0==56||(LA26_0>=58 && LA26_0<=65)) ) {s = 5;}

                        else if ( (LA26_0==39) ) {s = 27;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\74\uffff";
    static final String DFA28_eofS =
        "\1\2\73\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA28_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1736:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\36\uffff";
    static final String DFA34_eofS =
        "\36\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA34_maxS =
        "\1\104\2\0\33\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\5\1\1\22\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff\6\5\1\uffff"+
            "\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2019:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==38) ) {s = 2;}

                        else if ( (LA34_0==68) && (synpred16_InternalModelQueryLanguage())) {s = 3;}

                        else if ( (LA34_0==41) && (synpred16_InternalModelQueryLanguage())) {s = 4;}

                        else if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_STRING)||LA34_0==25||(LA34_0>=28 && LA34_0<=29)||LA34_0==33||LA34_0==40||(LA34_0>=42 && LA34_0<=43)||LA34_0==45||LA34_0==47||(LA34_0>=51 && LA34_0<=56)||(LA34_0>=58 && LA34_0<=65)) ) {s = 5;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\74\uffff";
    static final String DFA57_eofS =
        "\1\2\73\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA57_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA57_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\26\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3322:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\34\uffff";
    static final String DFA56_eofS =
        "\34\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA56_maxS =
        "\1\104\2\0\31\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\5\1\1\22\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3343:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==38) ) {s = 2;}

                        else if ( (LA56_0==68) && (synpred22_InternalModelQueryLanguage())) {s = 3;}

                        else if ( (LA56_0==41) && (synpred22_InternalModelQueryLanguage())) {s = 4;}

                        else if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_STRING)||LA56_0==25||(LA56_0>=28 && LA56_0<=29)||LA56_0==33||LA56_0==40||LA56_0==43||LA56_0==45||LA56_0==47||(LA56_0>=51 && LA56_0<=53)||LA56_0==56||(LA56_0>=58 && LA56_0<=65)) ) {s = 5;}

                        else if ( (LA56_0==39) ) {s = 27;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\74\uffff";
    static final String DFA58_eofS =
        "\1\2\73\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA58_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA58_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3422:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\34\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA64_maxS =
        "\1\104\2\0\31\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\5\1\1\22\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3619:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==38) ) {s = 2;}

                        else if ( (LA64_0==68) && (synpred24_InternalModelQueryLanguage())) {s = 3;}

                        else if ( (LA64_0==41) && (synpred24_InternalModelQueryLanguage())) {s = 4;}

                        else if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||LA64_0==25||(LA64_0>=28 && LA64_0<=29)||LA64_0==33||LA64_0==40||LA64_0==43||LA64_0==45||LA64_0==47||(LA64_0>=51 && LA64_0<=53)||LA64_0==56||(LA64_0>=58 && LA64_0<=65)) ) {s = 5;}

                        else if ( (LA64_0==39) ) {s = 27;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalModelQueryLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\74\uffff";
    static final String DFA65_eofS =
        "\1\2\73\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA65_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3698:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\74\uffff";
    static final String DFA67_eofS =
        "\1\31\73\uffff";
    static final String DFA67_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA67_maxS =
        "\1\104\30\0\43\uffff";
    static final String DFA67_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\15\1\17\1\1\5\uffff\3\31\1\uffff\11\31\1\10\2\31\1\4\1\3"+
            "\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1\7\1\31"+
            "\1\6\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16"+
            "\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4022:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\74\uffff";
    static final String DFA78_eofS =
        "\1\2\73\uffff";
    static final String DFA78_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA78_maxS =
        "\1\104\1\0\72\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA78_transitionS = {
            "\3\2\5\uffff\3\2\1\uffff\11\2\1\1\17\2\1\uffff\17\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4463:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalModelQueryLanguage()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0xFDF8A94232000870L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXBlockExpressionWithoutBraces_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard352 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpressionWithoutBraces_in_entryRuleXBlockExpressionWithoutBraces426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpressionWithoutBraces436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpressionWithoutBraces492 = new BitSet(new long[]{0xFDF8A94232004072L,0x0000000000000003L});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpressionWithoutBraces505 = new BitSet(new long[]{0xFDF8A94232000072L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment703 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment719 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment769 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment822 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpSingleAssign933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMultiAssign1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1117 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1170 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1193 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpOr1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1376 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1429 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1452 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpAnd1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1635 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1688 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1711 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1915 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_21_in_ruleXRelationalExpression1951 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1976 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2037 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2060 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2303 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2356 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2379 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2583 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2636 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2659 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpAdd2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAdd2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2863 = new BitSet(new long[]{0x00000001C0002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2916 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2939 = new BitSet(new long[]{0x00000001C0002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpMulti3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMulti3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3192 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpUnary3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpUnary3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3462 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleXCastedExpression3497 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3520 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3615 = new BitSet(new long[]{0x0000001800001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall3664 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3687 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3703 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3725 = new BitSet(new long[]{0x0000001800001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall3811 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall3835 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3872 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3901 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3922 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall3935 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3956 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3995 = new BitSet(new long[]{0x0000015800001002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4029 = new BitSet(new long[]{0xFDF8ABC232000070L,0x0000000000000013L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4114 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4142 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4155 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4176 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4193 = new BitSet(new long[]{0x0000011800001002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4226 = new BitSet(new long[]{0x0000001800001002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXClosure4965 = new BitSet(new long[]{0xFDF8AF4232000070L,0x0000000000000013L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5036 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXClosure5049 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5070 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5092 = new BitSet(new long[]{0xFDF8AD4232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5129 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5243 = new BitSet(new long[]{0xFDF8A94232004072L,0x0000000000000003L});
    public static final BitSet FOLLOW_14_in_ruleXExpressionInClosure5256 = new BitSet(new long[]{0xFDF8A94232000072L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5414 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXShortClosure5427 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5448 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5470 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXParenthesizedExpression5589 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5611 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXParenthesizedExpression5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5714 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXIfExpression5726 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5747 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXIfExpression5759 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5780 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5801 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression5917 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5958 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression5970 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5994 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6006 = new BitSet(new long[]{0x0004404000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6027 = new BitSet(new long[]{0x0007404000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6041 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6053 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6074 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6180 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6194 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6215 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCasePart6229 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6342 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXForLoopExpression6354 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6375 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6387 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6408 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXForLoopExpression6420 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXWhileExpression6533 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXWhileExpression6545 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6566 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXWhileExpression6578 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression6691 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6712 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression6724 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXDoWhileExpression6736 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6757 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXDoWhileExpression6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression6861 = new BitSet(new long[]{0xFDFAA94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6883 = new BitSet(new long[]{0xFDFAA94232004070L,0x0000000000000003L});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression6896 = new BitSet(new long[]{0xFDFAA94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXVariableDeclaration7130 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_55_in_ruleXVariableDeclaration7161 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7230 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7259 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXVariableDeclaration7273 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7502 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7626 = new BitSet(new long[]{0x0100000002000040L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7640 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7661 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7674 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7695 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7709 = new BitSet(new long[]{0x0100000002000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7734 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall7768 = new BitSet(new long[]{0xFDF8ABC232000070L,0x0000000000000013L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7853 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7881 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7894 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7915 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7932 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleIdOrSuper8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8184 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleStaticQualifier8202 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXConstructorCall8299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8322 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8335 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8356 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8369 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8390 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8404 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall8418 = new BitSet(new long[]{0xFDF8ABC232000070L,0x0000000000000013L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8490 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8518 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8531 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8552 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8569 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXBooleanLiteral8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXBooleanLiteral8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXNullLiteral8824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXTypeLiteral9120 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXTypeLiteral9132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9155 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXTypeLiteral9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXThrowExpression9259 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXReturnExpression9372 = new BitSet(new long[]{0xFDF8A94232000072L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTryCatchFinallyExpression9496 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9517 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9547 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression9569 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression9613 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXCatchClause9727 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXCatchClause9740 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9761 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXCatchClause9773 = new BitSet(new long[]{0xFDF8A94232000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9889 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName9917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9940 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10045 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleJvmTypeReference10083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleJvmTypeReference10095 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef10210 = new BitSet(new long[]{0x000000C000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10232 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFunctionTypeRef10245 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10266 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef10282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXFunctionTypeRef10296 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10411 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10432 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10454 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference10467 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10488 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmWildcardTypeReference10715 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmUpperBound10849 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmUpperBoundAnded10953 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleJvmLowerBound11057 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalModelQueryLanguage790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalModelQueryLanguage1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalModelQueryLanguage1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalModelQueryLanguage1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalModelQueryLanguage1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalModelQueryLanguage2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalModelQueryLanguage2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalModelQueryLanguage2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalModelQueryLanguage2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred10_InternalModelQueryLanguage3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred11_InternalModelQueryLanguage3632 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalModelQueryLanguage3641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalModelQueryLanguage3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred12_InternalModelQueryLanguage3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred12_InternalModelQueryLanguage3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred12_InternalModelQueryLanguage3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred13_InternalModelQueryLanguage4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalModelQueryLanguage4063 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred14_InternalModelQueryLanguage4070 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalModelQueryLanguage4077 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalModelQueryLanguage4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalModelQueryLanguage4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalModelQueryLanguage4982 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred16_InternalModelQueryLanguage4989 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalModelQueryLanguage4996 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred16_InternalModelQueryLanguage5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred18_InternalModelQueryLanguage5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalModelQueryLanguage5933 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred19_InternalModelQueryLanguage5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalModelQueryLanguage7179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalModelQueryLanguage7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred21_InternalModelQueryLanguage7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalModelQueryLanguage7802 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred22_InternalModelQueryLanguage7809 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalModelQueryLanguage7816 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred22_InternalModelQueryLanguage7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalModelQueryLanguage7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalModelQueryLanguage8439 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred24_InternalModelQueryLanguage8446 = new BitSet(new long[]{0x0000004000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalModelQueryLanguage8453 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred24_InternalModelQueryLanguage8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalModelQueryLanguage8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalModelQueryLanguage9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred27_InternalModelQueryLanguage9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred28_InternalModelQueryLanguage9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred30_InternalModelQueryLanguage9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred31_InternalModelQueryLanguage10060 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalModelQueryLanguage10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred32_InternalModelQueryLanguage10424 = new BitSet(new long[]{0x0000000000000002L});

}