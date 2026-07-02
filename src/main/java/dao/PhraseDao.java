package dao; import java.util.*; import model.Phrase;
public interface PhraseDao { List<Phrase> findAll(); Phrase findByChinese(String zh); void create(Phrase p); void update(Phrase p); void delete(int id); }
