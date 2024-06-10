import "../assets/css/buttonStyle.css";

export default function Button(props) {
  const handleClick = () => {
    if (props.onClick) {
      props.onClick();
    } else if (props.url) {
      window.location.href = props.url;
    }
  };

  return (
    <button onClick={handleClick}>
      <img src={props.img} alt="이미지" />
      <span>{props.title}</span>
    </button>
  );
}
