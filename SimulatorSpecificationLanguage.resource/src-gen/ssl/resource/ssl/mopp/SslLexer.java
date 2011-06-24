// $ANTLR ${project.version} ${buildNumber}

	package ssl.resource.ssl.mopp;


import org.antlr.runtime3_2_0.*;

public class SslLexer extends Lexer {
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=5;
    public static final int TEXT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int LINEBREAK=6;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public SslLexer() {;} 
    public SslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Ssl.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:16:6: ( 'Given' )
            // Ssl.g:16:8: 'Given'
            {
            match("Given"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:17:6: ( 'When' )
            // Ssl.g:17:8: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:18:6: ( 'Then' )
            // Ssl.g:18:8: 'Then'
            {
            match("Then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:19:7: ( 'the watch is in mode \\\"' )
            // Ssl.g:19:9: 'the watch is in mode \\\"'
            {
            match("the watch is in mode \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:20:7: ( '\\\"' )
            // Ssl.g:20:9: '\\\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:21:7: ( 'the \\\"' )
            // Ssl.g:21:9: 'the \\\"'
            {
            match("the \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:22:7: ( '\\\" is showing \\\"' )
            // Ssl.g:22:9: '\\\" is showing \\\"'
            {
            match("\" is showing \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:23:7: ( ' is equal to ' )
            // Ssl.g:23:9: ' is equal to '
            {
            match(" is equal to "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:24:7: ( ' is equal to time ' )
            // Ssl.g:24:9: ' is equal to time '
            {
            match(" is equal to time "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:25:7: ( 'the watch enters mode \\\"' )
            // Ssl.g:25:9: 'the watch enters mode \\\"'
            {
            match("the watch enters mode \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:26:7: ( 'the ' )
            // Ssl.g:26:9: 'the '
            {
            match("the "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:27:7: ( ' button is pressed' )
            // Ssl.g:27:9: ' button is pressed'
            {
            match(" button is pressed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:28:7: ( 'the watch must be in mode \\\"' )
            // Ssl.g:28:9: 'the watch must be in mode \\\"'
            {
            match("the watch must be in mode \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:29:7: ( ' button must be called \\\"' )
            // Ssl.g:29:9: ' button must be called \\\"'
            {
            match(" button must be called \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:30:7: ( '\\\" must show \\\"' )
            // Ssl.g:30:9: '\\\" must show \\\"'
            {
            match("\" must show \""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:31:7: ( '\\\" must show the ' )
            // Ssl.g:31:9: '\\\" must show the '
            {
            match("\" must show the "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:32:7: ( ' must be incremented by 1 ' )
            // Ssl.g:32:9: ' must be incremented by 1 '
            {
            match(" must be incremented by 1 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:33:7: ( 'the alarm must ring' )
            // Ssl.g:33:9: 'the alarm must ring'
            {
            match("the alarm must ring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:2257:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Ssl.g:2258:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Ssl.g:2258:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Ssl.g:2258:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Ssl.g:2258:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ssl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:2260:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Ssl.g:2261:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Ssl.g:2261:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Ssl.g:2261:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ssl.g:2264:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Ssl.g:2265:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Ssl.g:2265:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Ssl.g:2265:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Ssl.g:2265:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Ssl.g:2265:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Ssl.g:2265:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Ssl.g:2265:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Ssl.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | TEXT | WHITESPACE | LINEBREAK )
        int alt3=21;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // Ssl.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // Ssl.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // Ssl.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // Ssl.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // Ssl.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // Ssl.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // Ssl.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // Ssl.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // Ssl.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // Ssl.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // Ssl.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // Ssl.g:1:73: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // Ssl.g:1:79: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // Ssl.g:1:85: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // Ssl.g:1:91: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // Ssl.g:1:97: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // Ssl.g:1:103: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // Ssl.g:1:109: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // Ssl.g:1:115: TEXT
                {
                mTEXT(); 

                }
                break;
            case 20 :
                // Ssl.g:1:120: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 21 :
                // Ssl.g:1:131: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\4\7\1\17\1\10\3\uffff\4\7\5\uffff\4\7\4\uffff\1\7\1\43"+
        "\1\44\1\50\3\uffff\1\54\47\uffff\1\114\2\uffff";
    static final String DFA3_eofS =
        "\115\uffff";
    static final String DFA3_minS =
        "\1\11\1\151\3\150\1\40\1\142\3\uffff\1\166\3\145\1\151\1\uffff\1"+
        "\163\1\165\1\uffff\1\145\2\156\1\40\1\uffff\1\165\1\40\1\164\1\156"+
        "\2\55\1\42\1\163\1\145\1\164\1\55\2\uffff\1\141\3\uffff\1\164\1"+
        "\161\1\157\1\uffff\1\164\1\40\1\165\1\156\1\143\1\163\1\141\1\40"+
        "\2\150\1\154\1\151\1\40\1\157\1\40\2\uffff\1\145\1\167\1\164\3\uffff"+
        "\1\40\1\157\1\42\1\40\2\uffff\1\164\2\uffff";
    static final String DFA3_maxS =
        "\1\172\1\151\3\150\1\40\1\155\3\uffff\1\166\3\145\1\155\1\uffff"+
        "\1\163\1\165\1\uffff\1\145\2\156\1\40\1\uffff\1\165\1\40\1\164\1"+
        "\156\2\172\1\167\1\163\1\145\1\164\1\172\2\uffff\1\141\3\uffff\1"+
        "\164\1\161\1\157\1\uffff\1\164\1\40\1\165\1\156\1\143\1\163\1\141"+
        "\1\40\2\150\1\154\1\155\1\40\1\157\1\40\2\uffff\1\155\1\167\1\164"+
        "\3\uffff\1\40\1\157\1\164\1\40\2\uffff\1\164\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\23\1\24\1\25\5\uffff\1\5\2\uffff\1\21\4\uffff\1\7\13"+
        "\uffff\1\2\1\3\1\uffff\1\6\1\22\1\13\3\uffff\1\1\17\uffff\1\14\1"+
        "\16\3\uffff\1\4\1\12\1\15\4\uffff\1\17\1\20\1\uffff\1\11\1\10";
    static final String DFA3_specialS =
        "\115\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\11\1\uffff\1\10\1\11\22\uffff\1\6\1\uffff\1\5\12\uffff"+
            "\1\7\2\uffff\12\7\7\uffff\6\7\1\1\14\7\1\3\2\7\1\2\3\7\4\uffff"+
            "\1\7\1\uffff\23\7\1\4\6\7",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\21\6\uffff\1\20\3\uffff\1\22",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27\3\uffff\1\30",
            "",
            "\1\31",
            "\1\32",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\46\76\uffff\1\47\25\uffff\1\45",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "",
            "\1\55",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74\3\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\102\3\uffff\1\101\3\uffff\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110\121\uffff\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}