import React,{useState} from 'react';
import './App.css';

function AttributeValue(){
  const [AttributeValue, setAttributeValue] = useState({
    forca: 10,
    destreza: 10,
    constituicao: 10,
    inteligencia: 10,
    sabedoria: 10,
    carisma: 10

  })
  
  const handleChange = (e) => {
    const { name, value } = e.target;
    setAtributos(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  return{
    <div>
      <h2>Atributos</h2>
      <label>
        Força:
        <input
          type="number"
          name="forca"
          value={atributos.forca}
          onChange={handleChange}
        />
      </label>
    </div>
  };
}

function FichaTormenta20() {
  return (
    <div>
      <h1>Ficha de Personagem - Tormenta 20</h1>
      <AtributosSection />
      {/* Adicione outros componentes para outras seções da ficha */}
    </div>
  );
}

export default FichaTormenta20;