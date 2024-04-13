package com.proyecto.prestamos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.prestamos.entity.Permiso;
import com.proyecto.prestamos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("select u from Usuario u where u.log=?1")
	public Usuario iniciarSesion(String vLogin);
	
	@Query("select p from RolPermiso rp join rp.permiso p where rp.rol.descripcion=?1")
	public List<Permiso> traerEnlacesDelUsuario(String desRol);

}
