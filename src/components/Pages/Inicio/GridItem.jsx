import { useEffect } from "react";
import { Link } from "react-router-dom"
import PropTypes from 'prop-types';
import { configureIntersectionObserverAndLazyLoading } from "../../../helpers/GridItem"

export const GridItem = ({id, gridItems}) => {
	// Ejecutamos la configuración una sola vez al montar el componente
    useEffect(() => {
        configureIntersectionObserverAndLazyLoading();
      }, []);

    return (
        <div className={`grid${id}`}>
            {
                gridItems.map((item, index) => (
                    <article className="item" key={index}>
                        <Link to={item.to}>
                            <img 
                                loading="lazy"
                                src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///ywAAAAAAQABAAACAUwAOw=="
                                data-src={item.imgSrc}
                                alt={item.alt}
                                className={`lazy gird${id}-img`}
                            />
                            <div
                                className={`divgird${id}`} 
                                data-aos-useClassNames={false}
                                data-aos="flip-left"
                                data-aos-easing="ease-out-cubic"
                                data-aos-duration="200" 
                            >
                                { id === 2 || id === 3 ? (
                                    <h3 className={`gird${id}-title`}>{item.title}</h3>
                                ):( /* id === 1 ? */
                                    <h4 className={`gird${id}-title`}>{item.title}</h4>
                                )}
                                <i className={item.iconClass}></i>
                            </div>
                        </Link>
                    </article>
                ))
            }
        </div>
    )
}

GridItem.propTypes = {
    id: PropTypes.number.isRequired,
    gridItems: PropTypes.arrayOf(
        PropTypes.shape({
            to: PropTypes.string.isRequired, imgSrc: PropTypes.string.isRequired,
            alt: PropTypes.string.isRequired, title: PropTypes.string.isRequired,
            iconClass: PropTypes.string.isRequired,
        })
    ).isRequired,
};