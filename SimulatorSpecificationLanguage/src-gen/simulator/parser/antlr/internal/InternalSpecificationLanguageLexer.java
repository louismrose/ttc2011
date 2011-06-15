package simulator.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecificationLanguageLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalSpecificationLanguageLexer() {;} 
    public InternalSpecificationLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:10:5: ( 'Specification' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:10:7: 'Specification'
            {
            match("Specification"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:11:5: ( '{' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:12:5: ( 'testcases' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:12:7: 'testcases'
            {
            match("testcases"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:13:5: ( ',' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:13:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:14:5: ( '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:14:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:15:5: ( 'Testcase' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:15:7: 'Testcase'
            {
            match("Testcase"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:16:5: ( 'given' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:16:7: 'given'
            {
            match("given"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:17:5: ( 'when' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:17:7: 'when'
            {
            match("when"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:18:5: ( 'then' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:18:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:19:5: ( 'Given' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:19:7: 'Given'
            {
            match("Given"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:20:5: ( 'conditions' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:20:7: 'conditions'
            {
            match("conditions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:21:5: ( 'When' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:21:7: 'When'
            {
            match("When"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:22:5: ( 'actions' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:22:7: 'actions'
            {
            match("actions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:23:5: ( 'Then' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:23:7: 'Then'
            {
            match("Then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:24:5: ( 'observations' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:24:7: 'observations'
            {
            match("observations"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:25:5: ( 'SetMode' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:25:7: 'SetMode'
            {
            match("SetMode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:26:5: ( 'mode' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:26:7: 'mode'
            {
            match("mode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:27:5: ( 'PressButton' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:27:7: 'PressButton'
            {
            match("PressButton"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:28:5: ( 'button' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:28:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:29:5: ( 'ObserveMode' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:29:7: 'ObserveMode'
            {
            match("ObserveMode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:30:5: ( 'ObserveBinding' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:30:7: 'ObserveBinding'
            {
            match("ObserveBinding"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:31:5: ( 'ObserveDisplay' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:31:7: 'ObserveDisplay'
            {
            match("ObserveDisplay"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:32:5: ( 'value' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:32:7: 'value'
            {
            match("value"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1150:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1150:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1150:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1150:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1150:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1152:10: ( ( '0' .. '9' )+ )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1152:12: ( '0' .. '9' )+
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1152:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1152:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1154:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1156:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1156:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1156:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1156:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:41: ( '\\r' )? '\\n'
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1158:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1162:16: ( . )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1162:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='S') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='T') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='g') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='w') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='G') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='W') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='m') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='P') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='b') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='O') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper019();
        }
        else if ( ((LA12_0>='A' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='N')||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='d' && LA12_0<='f')||(LA12_0>='h' && LA12_0<='l')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='s')||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12 = mTokensHelper020();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper024();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper025();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper026();
        }
        else {
            alt12 = mTokensHelper027();
        }
        switch (alt12) {
            case 1 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_27 = input.LA(3);

            if ( (LA12_27=='t') ) {
                int LA12_54 = input.LA(4);

                if ( (LA12_54=='M') ) {
                    int LA12_72 = input.LA(5);

                    if ( (LA12_72=='o') ) {
                        int LA12_90 = input.LA(6);

                        if ( (LA12_90=='d') ) {
                            int LA12_108 = input.LA(7);

                            if ( (LA12_108=='e') ) {
                                int LA12_121 = input.LA(8);

                                if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                    return 24;
                                }
                                else {
                                    return 16;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        case 'p':
            {
            int LA12_28 = input.LA(3);

            if ( (LA12_28=='e') ) {
                int LA12_55 = input.LA(4);

                if ( (LA12_55=='c') ) {
                    int LA12_73 = input.LA(5);

                    if ( (LA12_73=='i') ) {
                        int LA12_91 = input.LA(6);

                        if ( (LA12_91=='f') ) {
                            int LA12_109 = input.LA(7);

                            if ( (LA12_109=='i') ) {
                                int LA12_122 = input.LA(8);

                                if ( (LA12_122=='c') ) {
                                    int LA12_132 = input.LA(9);

                                    if ( (LA12_132=='a') ) {
                                        int LA12_142 = input.LA(10);

                                        if ( (LA12_142=='t') ) {
                                            int LA12_151 = input.LA(11);

                                            if ( (LA12_151=='i') ) {
                                                int LA12_159 = input.LA(12);

                                                if ( (LA12_159=='o') ) {
                                                    int LA12_166 = input.LA(13);

                                                    if ( (LA12_166=='n') ) {
                                                        int LA12_172 = input.LA(14);

                                                        if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                                                            return 24;
                                                        }
                                                        else {
                                                            return 1;}
                                                    }
                                                    else {
                                                        return 24;}
                                                }
                                                else {
                                                    return 24;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        default:
            return 24;}

    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'h':
            {
            int LA12_31 = input.LA(3);

            if ( (LA12_31=='e') ) {
                int LA12_56 = input.LA(4);

                if ( (LA12_56=='n') ) {
                    int LA12_74 = input.LA(5);

                    if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                        return 24;
                    }
                    else {
                        return 9;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        case 'e':
            {
            int LA12_32 = input.LA(3);

            if ( (LA12_32=='s') ) {
                int LA12_57 = input.LA(4);

                if ( (LA12_57=='t') ) {
                    int LA12_75 = input.LA(5);

                    if ( (LA12_75=='c') ) {
                        int LA12_93 = input.LA(6);

                        if ( (LA12_93=='a') ) {
                            int LA12_110 = input.LA(7);

                            if ( (LA12_110=='s') ) {
                                int LA12_123 = input.LA(8);

                                if ( (LA12_123=='e') ) {
                                    int LA12_133 = input.LA(9);

                                    if ( (LA12_133=='s') ) {
                                        int LA12_143 = input.LA(10);

                                        if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                            return 24;
                                        }
                                        else {
                                            return 3;}
                                    }
                                    else {
                                        return 24;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        default:
            return 24;}

    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'h':
            {
            int LA12_35 = input.LA(3);

            if ( (LA12_35=='e') ) {
                int LA12_58 = input.LA(4);

                if ( (LA12_58=='n') ) {
                    int LA12_76 = input.LA(5);

                    if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
                        return 24;
                    }
                    else {
                        return 14;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        case 'e':
            {
            int LA12_36 = input.LA(3);

            if ( (LA12_36=='s') ) {
                int LA12_59 = input.LA(4);

                if ( (LA12_59=='t') ) {
                    int LA12_77 = input.LA(5);

                    if ( (LA12_77=='c') ) {
                        int LA12_95 = input.LA(6);

                        if ( (LA12_95=='a') ) {
                            int LA12_111 = input.LA(7);

                            if ( (LA12_111=='s') ) {
                                int LA12_124 = input.LA(8);

                                if ( (LA12_124=='e') ) {
                                    int LA12_134 = input.LA(9);

                                    if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                                        return 24;
                                    }
                                    else {
                                        return 6;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        default:
            return 24;}

    }

    private int mTokensHelper007() throws RecognitionException {
        int LA12_7 = input.LA(2);

        if ( (LA12_7=='i') ) {
            int LA12_37 = input.LA(3);

            if ( (LA12_37=='v') ) {
                int LA12_60 = input.LA(4);

                if ( (LA12_60=='e') ) {
                    int LA12_78 = input.LA(5);

                    if ( (LA12_78=='n') ) {
                        int LA12_96 = input.LA(6);

                        if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
                            return 24;
                        }
                        else {
                            return 7;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper008() throws RecognitionException {
        int LA12_8 = input.LA(2);

        if ( (LA12_8=='h') ) {
            int LA12_38 = input.LA(3);

            if ( (LA12_38=='e') ) {
                int LA12_61 = input.LA(4);

                if ( (LA12_61=='n') ) {
                    int LA12_79 = input.LA(5);

                    if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                        return 24;
                    }
                    else {
                        return 8;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper009() throws RecognitionException {
        int LA12_9 = input.LA(2);

        if ( (LA12_9=='i') ) {
            int LA12_39 = input.LA(3);

            if ( (LA12_39=='v') ) {
                int LA12_62 = input.LA(4);

                if ( (LA12_62=='e') ) {
                    int LA12_80 = input.LA(5);

                    if ( (LA12_80=='n') ) {
                        int LA12_98 = input.LA(6);

                        if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                            return 24;
                        }
                        else {
                            return 10;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper010() throws RecognitionException {
        int LA12_10 = input.LA(2);

        if ( (LA12_10=='o') ) {
            int LA12_40 = input.LA(3);

            if ( (LA12_40=='n') ) {
                int LA12_63 = input.LA(4);

                if ( (LA12_63=='d') ) {
                    int LA12_81 = input.LA(5);

                    if ( (LA12_81=='i') ) {
                        int LA12_99 = input.LA(6);

                        if ( (LA12_99=='t') ) {
                            int LA12_114 = input.LA(7);

                            if ( (LA12_114=='i') ) {
                                int LA12_125 = input.LA(8);

                                if ( (LA12_125=='o') ) {
                                    int LA12_135 = input.LA(9);

                                    if ( (LA12_135=='n') ) {
                                        int LA12_145 = input.LA(10);

                                        if ( (LA12_145=='s') ) {
                                            int LA12_153 = input.LA(11);

                                            if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                                return 24;
                                            }
                                            else {
                                                return 11;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA12_11 = input.LA(2);

        if ( (LA12_11=='h') ) {
            int LA12_41 = input.LA(3);

            if ( (LA12_41=='e') ) {
                int LA12_64 = input.LA(4);

                if ( (LA12_64=='n') ) {
                    int LA12_82 = input.LA(5);

                    if ( ((LA12_82>='0' && LA12_82<='9')||(LA12_82>='A' && LA12_82<='Z')||LA12_82=='_'||(LA12_82>='a' && LA12_82<='z')) ) {
                        return 24;
                    }
                    else {
                        return 12;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper012() throws RecognitionException {
        int LA12_12 = input.LA(2);

        if ( (LA12_12=='c') ) {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='t') ) {
                int LA12_65 = input.LA(4);

                if ( (LA12_65=='i') ) {
                    int LA12_83 = input.LA(5);

                    if ( (LA12_83=='o') ) {
                        int LA12_101 = input.LA(6);

                        if ( (LA12_101=='n') ) {
                            int LA12_115 = input.LA(7);

                            if ( (LA12_115=='s') ) {
                                int LA12_126 = input.LA(8);

                                if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                                    return 24;
                                }
                                else {
                                    return 13;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper013() throws RecognitionException {
        int LA12_13 = input.LA(2);

        if ( (LA12_13=='b') ) {
            int LA12_43 = input.LA(3);

            if ( (LA12_43=='s') ) {
                int LA12_66 = input.LA(4);

                if ( (LA12_66=='e') ) {
                    int LA12_84 = input.LA(5);

                    if ( (LA12_84=='r') ) {
                        int LA12_102 = input.LA(6);

                        if ( (LA12_102=='v') ) {
                            int LA12_116 = input.LA(7);

                            if ( (LA12_116=='a') ) {
                                int LA12_127 = input.LA(8);

                                if ( (LA12_127=='t') ) {
                                    int LA12_137 = input.LA(9);

                                    if ( (LA12_137=='i') ) {
                                        int LA12_146 = input.LA(10);

                                        if ( (LA12_146=='o') ) {
                                            int LA12_154 = input.LA(11);

                                            if ( (LA12_154=='n') ) {
                                                int LA12_161 = input.LA(12);

                                                if ( (LA12_161=='s') ) {
                                                    int LA12_167 = input.LA(13);

                                                    if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                                                        return 24;
                                                    }
                                                    else {
                                                        return 15;}
                                                }
                                                else {
                                                    return 24;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper014() throws RecognitionException {
        int LA12_14 = input.LA(2);

        if ( (LA12_14=='o') ) {
            int LA12_44 = input.LA(3);

            if ( (LA12_44=='d') ) {
                int LA12_67 = input.LA(4);

                if ( (LA12_67=='e') ) {
                    int LA12_85 = input.LA(5);

                    if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                        return 24;
                    }
                    else {
                        return 17;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper015() throws RecognitionException {
        int LA12_15 = input.LA(2);

        if ( (LA12_15=='r') ) {
            int LA12_45 = input.LA(3);

            if ( (LA12_45=='e') ) {
                int LA12_68 = input.LA(4);

                if ( (LA12_68=='s') ) {
                    int LA12_86 = input.LA(5);

                    if ( (LA12_86=='s') ) {
                        int LA12_104 = input.LA(6);

                        if ( (LA12_104=='B') ) {
                            int LA12_117 = input.LA(7);

                            if ( (LA12_117=='u') ) {
                                int LA12_128 = input.LA(8);

                                if ( (LA12_128=='t') ) {
                                    int LA12_138 = input.LA(9);

                                    if ( (LA12_138=='t') ) {
                                        int LA12_147 = input.LA(10);

                                        if ( (LA12_147=='o') ) {
                                            int LA12_155 = input.LA(11);

                                            if ( (LA12_155=='n') ) {
                                                int LA12_162 = input.LA(12);

                                                if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                                    return 24;
                                                }
                                                else {
                                                    return 18;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA12_16 = input.LA(2);

        if ( (LA12_16=='u') ) {
            int LA12_46 = input.LA(3);

            if ( (LA12_46=='t') ) {
                int LA12_69 = input.LA(4);

                if ( (LA12_69=='t') ) {
                    int LA12_87 = input.LA(5);

                    if ( (LA12_87=='o') ) {
                        int LA12_105 = input.LA(6);

                        if ( (LA12_105=='n') ) {
                            int LA12_118 = input.LA(7);

                            if ( ((LA12_118>='0' && LA12_118<='9')||(LA12_118>='A' && LA12_118<='Z')||LA12_118=='_'||(LA12_118>='a' && LA12_118<='z')) ) {
                                return 24;
                            }
                            else {
                                return 19;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='b') ) {
            int LA12_47 = input.LA(3);

            if ( (LA12_47=='s') ) {
                int LA12_70 = input.LA(4);

                if ( (LA12_70=='e') ) {
                    int LA12_88 = input.LA(5);

                    if ( (LA12_88=='r') ) {
                        int LA12_106 = input.LA(6);

                        if ( (LA12_106=='v') ) {
                            int LA12_119 = input.LA(7);

                            if ( (LA12_119=='e') ) {
                                switch ( input.LA(8) ) {
                                case 'D':
                                    {
                                    int LA12_139 = input.LA(9);

                                    if ( (LA12_139=='i') ) {
                                        int LA12_148 = input.LA(10);

                                        if ( (LA12_148=='s') ) {
                                            int LA12_156 = input.LA(11);

                                            if ( (LA12_156=='p') ) {
                                                int LA12_163 = input.LA(12);

                                                if ( (LA12_163=='l') ) {
                                                    int LA12_169 = input.LA(13);

                                                    if ( (LA12_169=='a') ) {
                                                        int LA12_174 = input.LA(14);

                                                        if ( (LA12_174=='y') ) {
                                                            int LA12_177 = input.LA(15);

                                                            if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                                                return 24;
                                                            }
                                                            else {
                                                                return 22;}
                                                        }
                                                        else {
                                                            return 24;}
                                                    }
                                                    else {
                                                        return 24;}
                                                }
                                                else {
                                                    return 24;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                    }
                                case 'B':
                                    {
                                    int LA12_140 = input.LA(9);

                                    if ( (LA12_140=='i') ) {
                                        int LA12_149 = input.LA(10);

                                        if ( (LA12_149=='n') ) {
                                            int LA12_157 = input.LA(11);

                                            if ( (LA12_157=='d') ) {
                                                int LA12_164 = input.LA(12);

                                                if ( (LA12_164=='i') ) {
                                                    int LA12_170 = input.LA(13);

                                                    if ( (LA12_170=='n') ) {
                                                        int LA12_175 = input.LA(14);

                                                        if ( (LA12_175=='g') ) {
                                                            int LA12_178 = input.LA(15);

                                                            if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                                                                return 24;
                                                            }
                                                            else {
                                                                return 21;}
                                                        }
                                                        else {
                                                            return 24;}
                                                    }
                                                    else {
                                                        return 24;}
                                                }
                                                else {
                                                    return 24;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                    }
                                case 'M':
                                    {
                                    int LA12_141 = input.LA(9);

                                    if ( (LA12_141=='o') ) {
                                        int LA12_150 = input.LA(10);

                                        if ( (LA12_150=='d') ) {
                                            int LA12_158 = input.LA(11);

                                            if ( (LA12_158=='e') ) {
                                                int LA12_165 = input.LA(12);

                                                if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                                                    return 24;
                                                }
                                                else {
                                                    return 20;}
                                            }
                                            else {
                                                return 24;}
                                        }
                                        else {
                                            return 24;}
                                    }
                                    else {
                                        return 24;}
                                    }
                                default:
                                    return 24;}

                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='a') ) {
            int LA12_48 = input.LA(3);

            if ( (LA12_48=='l') ) {
                int LA12_71 = input.LA(4);

                if ( (LA12_71=='u') ) {
                    int LA12_89 = input.LA(5);

                    if ( (LA12_89=='e') ) {
                        int LA12_107 = input.LA(6);

                        if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                            return 24;
                        }
                        else {
                            return 23;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( ((LA12_19>='A' && LA12_19<='Z')||LA12_19=='_'||(LA12_19>='a' && LA12_19<='z')) ) {
            return 24;
        }
        else {
            return 30;}
    }

    private int mTokensHelper020() throws RecognitionException {
        return 24;
    }

    private int mTokensHelper021() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA12_22 = input.LA(2);

        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFE')) ) {
            return 26;
        }
        else {
            return 30;}
    }

    private int mTokensHelper023() throws RecognitionException {
        int LA12_23 = input.LA(2);

        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
            return 26;
        }
        else {
            return 30;}
    }

    private int mTokensHelper024() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 28;
            }
        case '*':
            {
            return 27;
            }
        default:
            return 30;}

    }

    private int mTokensHelper025() throws RecognitionException {
        return 29;
    }

    private int mTokensHelper026() throws RecognitionException {
        return 30;
    }

    private int mTokensHelper027() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}