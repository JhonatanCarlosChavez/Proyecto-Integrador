package com.proyecto.prestamos.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.services.UsuarioServices;

public class UserServices implements UserDetailsService {
	@Autowired
	private UsuarioServices servicioUsu;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//declarar
		UserDetails bean=null;
		//validar inicio de sesión
		Usuario usu=servicioUsu.sesionDelUsuario(username);
		//rol
		Set<GrantedAuthority> rol=new HashSet<GrantedAuthority>();
		//adicionar
		rol.add(new SimpleGrantedAuthority(usu.getRol().getDescripcion()));
		//crear objeto bean
		bean=new User(username, usu.getPass(), rol);
		
		return bean;
	}
	

}
