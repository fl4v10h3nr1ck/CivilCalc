package beans;

import java.util.Date;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;
import comuns.Data;



@Anot_BD_Tabela(nome="projetos", prefixo="proj")
public class Projeto {

	
@Anot_BD_Campo(nome = "id_projeto", tipo=int.class, set = "setId_projeto", get = "getId_projeto", ehId=true)	
private int id_projeto;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=80)	
@Anot_TB_Coluna(posicao=0, rotulo="Título/Código", comprimento = 80)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;

@Anot_BD_Campo(nome = "objetivo", set = "setObjetivo", get = "getObjetivo")
private String objetivo;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=20)	
@Anot_TB_Coluna(posicao=1, rotulo="Data do Cadastro", comprimento = 20)
@Anot_BD_Campo(nome = "data_cadastro", tipo=Date.class, set = "setData_cadastro", get = "getData_cadastro", getBD = "getData_cadastroBD", getTab = "getData_cadastroString")
private Date data_cadastro;

@Anot_BD_Campo(nome = "obs", set = "setObs", get = "getObs")
private String obs;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")
private String status;

@Anot_BD_Campo(nome = "ordem", tipo=int.class, set = "setOrdem", get = "getOrdem")
private int ordem;

@Anot_BD_Campo(nome = "path_logo", set = "setPath_logo", get = "getPath_logo")
private String path_logo;

@Anot_BD_Campo(nome = "fk_endereco", tipo=int.class, set = "setFk_endereco", get = "getFk_endereco")
private int fk_endereco;

@Anot_BD_Campo(nome = "tomada_preco", set = "setTomada_preco", get = "getTomada_preco")
private String tomada_preco;

@Anot_BD_Campo(nome = "fk_bdi", tipo=int.class, set = "setFk_bdi", get = "getFk_bdi")
private int fk_bdi;

@Anot_BD_Campo(nome = "fk_encargo_horista", tipo=int.class, set = "setFk_encargo_horista", get = "getFk_encargo_horista")
private int fk_encargo_horista;

@Anot_BD_Campo(nome = "id_referencia", set = "setId_referencia", get = "getId_referencia")
private String id_referencia;


@Anot_BD_Campo(nome = "fk_encargo_mensalista", tipo=int.class, set = "setFk_encargo_mensalista", get = "getFk_encargo_mensalista")
private int fk_encargo_mensalista;

@Anot_BD_Campo(nome = "fk_responsavel", tipo=int.class, set = "setFk_responsavel", get = "getFk_responsavel")
private int fk_responsavel;



public String getTomada_preco() {	return tomada_preco;}
public void setTomada_preco(String tomada_preco) {this.tomada_preco = tomada_preco;}

public int getId_projeto() {	return id_projeto;}
public void setId_projeto(int id_projeto) {	this.id_projeto = id_projeto;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getObjetivo() {	return objetivo;}
public void setObjetivo(String objetivo) {	this.objetivo = objetivo;}

public Date getData_cadastro() {	return data_cadastro;}
public void setData_cadastro(Date data_cadastro) {	this.data_cadastro = data_cadastro;}
public Date getData_cadastroBD() {	return Data.getSqlData(data_cadastro);}
public String getData_cadastroString(){ return Data.converteDataParaString(getData_cadastro());}


public String getObs() {	return obs;}
public void setObs(String obs) {	this.obs = obs;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public int getOrdem() {	return ordem;}
public void setOrdem(int ordem) {	this.ordem = ordem;}

public String getPath_logo() {	return path_logo;}
public void setPath_logo(String path_logo) {	this.path_logo = path_logo;}

public int getFk_endereco() {	return this.fk_endereco;}
public void setFk_endereco(int fk_endereco) {	this.fk_endereco = fk_endereco;}

public int getFk_bdi() {	return fk_bdi;}
public void setFk_bdi(int fk_bdi) {	this.fk_bdi = fk_bdi;}

public int getFk_encargo_horista() {	return fk_encargo_horista;}
public void setFk_encargo_horista(int fk_encargo_horista) {	this.fk_encargo_horista = fk_encargo_horista;}

public String getId_referencia() {	return id_referencia;}
public void setId_referencia(String id_referencia) {	this.id_referencia = id_referencia;}

public int getFk_encargo_mensalista() {	return fk_encargo_mensalista;}
public void setFk_encargo_mensalista(int fk_encargo_mensalista) {	this.fk_encargo_mensalista = fk_encargo_mensalista;}

public int getFk_responsavel() {	return fk_responsavel;}
public void setFk_responsavel(int fk_responsavel) {	this.fk_responsavel = fk_responsavel;}




}
