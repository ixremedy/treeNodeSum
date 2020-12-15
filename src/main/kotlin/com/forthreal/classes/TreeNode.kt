package com.forthreal.classes

class TreeNode
{
    val code: Int
    val myValue : Int
    val nodeList : MutableList<TreeNode> = mutableListOf()

    public constructor(value: Int, hashcode: Int)
    {
        myValue = value
        code = hashcode
    }

    public constructor(node: TreeNode, value: Int, hashcode: Int)
    {
        myValue = value
        nodeList.add( node )
        code = hashcode
    }

    public constructor(nodes: List<TreeNode>, value: Int, hashcode: Int)
    {
        myValue = value
        nodeList.addAll( nodes )
        code = hashcode
    }

    public fun getNodes() = nodeList

    public fun getValue() = myValue

    override public fun hashCode() = code
}