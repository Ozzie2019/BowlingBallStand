import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Toroid
import eu.mihosoft.vrl.v3d.Cylinder
baseOg = new Toroid(50, 75, 90, 90).toCSG() 
base = baseOg.rotx(90)
.movez(26)
return [base,]