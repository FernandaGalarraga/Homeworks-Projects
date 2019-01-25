/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab26.cmd;

import ec.espe.edu.lab26.utils.FileManager;

/**
 *
 * @author Fernanda Galárraga
 */
public class Projectile {
    private float gravity=9.8f;
    private float initialVelocity;
    private double angle;
    private float velocityX;
    
    public float calculateDistance(){
        this.velocityX=((float) (Math.pow(this.initialVelocity,2)*  Math.sin(this.angle*2))/this.gravity);
        return this.velocityX;
    }

    
    
    
     public void addProjectileToFile()
   {
       FileManager file=new FileManager();
       String text;
       String fileName="Projectile.csv";
       file.exists(fileName);
       text= file.convertsToString(this);
       file.save(fileName,text);
   } 
    /**
     * @return the gravity
     */
    public float getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    /**
     * @return the initialVelocity
     */
    public float getInitialVelocity() {
        return initialVelocity;
    }

    /**
     * @param initialVelocity the initialVelocity to set
     */
    public void setInitialVelocity(float initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the velocityX
     */
    public float getVelocityX() {
        return velocityX;
    }

    /**
     * @param velocityX the velocityX to set
     */
    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }
    
    
}
