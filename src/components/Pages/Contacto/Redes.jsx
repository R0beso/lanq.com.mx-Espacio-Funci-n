import { RedesItem } from "../../../helpers/Redes";

export const Redes = () => {
  return (
    <>
        { RedesItem.map(redSocial => (
            <article key={redSocial.id}>
                <a href={redSocial.href} target="_blank" rel="noreferrer">
                    <div id={redSocial.id} className="redes">
                        <i className={redSocial.iconClass}></i>
                        <h3>{redSocial.text}</h3>
                    </div>
                </a>
            </article>
        ))}
    </>
  )
}
