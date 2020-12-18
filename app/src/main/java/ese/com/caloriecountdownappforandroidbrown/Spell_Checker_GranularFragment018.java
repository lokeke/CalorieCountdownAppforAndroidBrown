package ese.com.caloriecountdownappforandroidbrown;

import android.service.textservice.SpellCheckerService;



import android.util.Log;
import android.service.textservice.SpellCheckerService;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.TextInfo;
import android.os.Build;
import java.util.ArrayList;



public class Spell_Checker_GranularFragment018 extends SpellCheckerService
{
    private static final String TAG = Spell_Checker_GranularFragment018.class.getSimpleName();
    private static final Boolean DBG = true;

    @Override
    public Session createSession()
    {
        return new Checker_Sessions();
    }



    private static class Checker_Sessions extends Session
    {

        private String mLocale;


        @Override
        public void onCreate()
        {
            mLocale = getLocale();

        }

        @Override
        public SuggestionsInfo onGetSuggestions(TextInfo textInfo, int i)
        {
            if(DBG)
            {
                android.util.Log.d("onGetSugessions", textInfo.getText());
            }

            final String input = textInfo.getText();
            final int length = input.length();

            final int flags = length <= 3 ?  SuggestionsInfo.RESULT_ATTR_IN_THE_DICTIONARY : length <= 20 ?  SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO : 0;

            return new SuggestionsInfo(flags, new String[] { "aaa", "bbb", "Candidate for " + input, mLocale});
        }

        public boolean isSentenceSpellCheckerAPISupported()
        {
            return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN);
        }


        @Override
        public SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(TextInfo[] textInfos, int suggestionsLimit) {
            //return super.onGetSentenceSuggestionsMultiple(textInfos, suggestionsLimit);

            if(!isSentenceSpellCheckerAPISupported())
            {
                android.util.Log.d(TAG, "Spellchecker version not supported, " + "must have been called by accident matey.");
                return null;
            }

            final ArrayList<SentenceSuggestionsInfo> revetal = new ArrayList<SentenceSuggestionsInfo>();

            for(int i = 0; i < textInfos.length; ++i)
            {
                final TextInfo ti = textInfos[i];

                if(DBG)
                {
                    android.util.Log.d(TAG,"onGetSuggessionsMultiple " + ti.getText());
                }

                final String input = ti.getText();
                final int length = input.length();
                final SuggestionsInfo[] sis;
                final int[] offsets;
                final int[] lengths;

                if(input.equalsIgnoreCase("I wold like to inform you that"))
                {
                    final int flag0 = SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO;
                    final int flag1 = SuggestionsInfo.RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS | SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO;
                    final int flag2 = flag1;
                    final SuggestionsInfo si0 = new SuggestionsInfo(flag0, new String[]{"would"});
                    final SuggestionsInfo si1 = new SuggestionsInfo(flag1, new String[]{"hear"});
                    final SuggestionsInfo si2 = new SuggestionsInfo(flag2, new String[]{"from"});

                    sis = new SuggestionsInfo[]{si0, si1, si2};

                    offsets = new int[]{2, 15, 20};
                    lengths = new int[]{4, 4, 4};
                }
                else
                    {
                        final int flags = length <= 3 ? SuggestionsInfo.RESULT_ATTR_IN_THE_DICTIONARY : length <= 20 ? SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO : 0;
                        final SuggestionsInfo si = new SuggestionsInfo(flags, new String[] { "aaa","bbb","Candidate for "+ input, mLocale});
                        sis = new SuggestionsInfo[]{si};

                        offsets = new int[] {0};
                        lengths = new int[] {ti.getText().length()};

                    }

                    final SentenceSuggestionsInfo sister = new SentenceSuggestionsInfo(sis,lengths, offsets);
                    revetal.add(sister);


                }

            return revetal.toArray(new SentenceSuggestionsInfo[0]);

        }


        }
    }






