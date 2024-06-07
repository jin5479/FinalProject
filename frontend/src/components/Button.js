import "../assets/css/buttonStyle.css";

export default function Button(props) {
  return (
    <>
      <button onClick={() => (window.location.href = props.url)}>
        
        <img src={props.img} alt="이미지"></img>
        <span>{props.title}</span>
      </button>
    </>
  );
}
