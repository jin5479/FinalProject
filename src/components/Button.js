
import '../assets/css/buttonStyle.css'

export default function Button(props){
    
    return(
        <button onClick={() => window.location.href = props.url}>{props.title}</button>
    )
    
}