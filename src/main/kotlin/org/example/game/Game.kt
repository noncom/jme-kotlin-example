package org.example.game

import com.jme3.app.SimpleApplication
import com.jme3.light.SpotLight
import com.jme3.material.Material
import com.jme3.math.ColorRGBA
import com.jme3.scene.CameraNode

import com.jme3.scene.Geometry
import com.jme3.scene.LightNode
import com.jme3.scene.shape.Box

class Game : SimpleApplication() {

    override fun simpleInitApp() {
        val b = Box(1f, 1f, 1f)
        val geom = Geometry("Box", b)

        val cameraNode = CameraNode("main", camera)
        val light = SpotLight()

        val ln = LightNode("spot", light)
        cameraNode.attachChild(ln)

        val mat = Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md")
        mat.setColor("Color", ColorRGBA.Blue)
        geom.material = mat

        flyCam.isEnabled = false


        rootNode.attachChild(geom)
    }
}
