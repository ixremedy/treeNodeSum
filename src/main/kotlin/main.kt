
import com.forthreal.classes.SumFinder
import com.forthreal.classes.TreeNode

fun main(args: Array<String>) {

    var sum: Int = 0

    val nodes = TreeNode(
                            listOf(
                                TreeNode(
                                        listOf(
                                            TreeNode(3, 4),
                                            TreeNode(
                                                listOf(
                                                    TreeNode(17, 8),
                                                    TreeNode( TreeNode(9, 10), 11, 9)
                                                ),
                                       17, 5)
                                          ),
                                 5, 2),
                                TreeNode(
                                    listOf(
                                        TreeNode(11, 6),
                                        TreeNode( 15, 7 )
                                          ), 15, 3  ),
                                  ),
                        10, 1 )

    val next = SumFinder.nextNode( nodes, nodes )

    //System.out.println("value: ${value.first}")

}