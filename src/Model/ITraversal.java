package Model;
/**
 * @author MAAG - Sección 10 
 * @URL https://github.com/malonso-uvg/uvg2023ed10.git 
 */
public interface ITraversal<K, V> {

	void visit(TreeNode<K, V> actualNode);
	
}