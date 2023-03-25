package Model;
/**
 * @author MAAG - Sección 10 
 * @URL https://github.com/malonso-uvg/uvg2023ed10.git 
 */
public interface IGetKey<K, V> {
	String getKeyFromValue(V value);
}
