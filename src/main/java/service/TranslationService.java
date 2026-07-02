package service; import java.util.*; import model.Phrase;
public interface TranslationService { List<Phrase> phrases(); String translate(String input,String lang); void addPhrase(Phrase p); }
