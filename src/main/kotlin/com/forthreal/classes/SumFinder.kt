package com.forthreal.classes

import java.util.*

object SumFinder
{
    val existingList = mutableListOf<String>()

    fun nextNode(treeNode: TreeNode, rootNode: TreeNode) : Optional<TreeNode>
    {
        val iter = treeNode.getNodes().iterator()

        while( iter.hasNext() )
        {
            val newNode = iter.next()

            evaluate( rootNode, 20, newNode )

            val opNode = nextNode( newNode, rootNode  )

            if( opNode.isPresent == true )
            {

            }
        }

        return Optional.empty()
    }

    fun evaluate( node: TreeNode, target: Int, nodeToCompare: TreeNode ) : Int
    {
        var value : Int = 0
        val iter = node.getNodes().iterator()

        while( iter.hasNext() )
        {
            val newNode = iter.next()

            val result = evaluate ( newNode, target, nodeToCompare )

            //System.out.println("${pair.second} + ${valToCompare} = ${pair.second + valToCompare}")

            if( ( result + nodeToCompare.myValue ).equals( target ) == true )
            {
                System.out.println(
                    "Found target sum: " +
                            "${result} + ${nodeToCompare.myValue} = ${result + nodeToCompare.myValue} " +
                            " ${node.hashCode()} ${nodeToCompare.hashCode()}"
                )
                if(
                    (existingList.contains( "${node.hashCode()}-${nodeToCompare.hashCode()}" ) == false ) &&
                    (existingList.contains( "${nodeToCompare.hashCode()}-${node.hashCode()}" ) == false )
                )
                {
                    existingList.add( "${node.hashCode()}-${nodeToCompare.hashCode()}" )
                }
            }
        }

        return node.myValue
    }

}