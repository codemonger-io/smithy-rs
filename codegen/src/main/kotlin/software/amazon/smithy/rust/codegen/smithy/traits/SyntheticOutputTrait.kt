package software.amazon.smithy.rust.codegen.smithy.traits

import software.amazon.smithy.model.node.ObjectNode
import software.amazon.smithy.model.shapes.ShapeId
import software.amazon.smithy.model.traits.AnnotationTrait

/**
 * Indicates that a shape is a synthetic input (see `OperationNormalizer.kt`)
 */
class SyntheticOutputTrait constructor(val body: ShapeId?) :
    AnnotationTrait(ID, ObjectNode.fromStringMap(mapOf("body" to body.toString()))) {
    companion object {
        val ID = ShapeId.from("smithy.api.internal#syntheticOutput")
    }
}

/**
 * Indicates that a shape is a synthetic input body
 */
class OutputBodyTrait(objectNode: ObjectNode = ObjectNode.objectNode()) : AnnotationTrait(ID, objectNode) {
    companion object {
        val ID = ShapeId.from("smithy.api.internal#syntheticOutputBody")
    }
}
