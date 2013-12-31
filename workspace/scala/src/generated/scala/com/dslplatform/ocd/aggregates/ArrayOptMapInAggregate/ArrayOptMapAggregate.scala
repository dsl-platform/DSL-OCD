package com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptMap: Array[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.ArrayOptMapAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptMap = result._arrayOptMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.ArrayOptMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptMap")
  def arrayOptMap = {
    _arrayOptMap
  }

  def arrayOptMap_= (value: Array[Option[Map[String, String]]]) {
    _arrayOptMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptMap") arrayOptMap: Array[Option[Map[String, String]]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptMap = if (arrayOptMap == null) Array.empty else arrayOptMap)

}

object ArrayOptMapAggregate extends AggregateRootCompanion[ArrayOptMapAggregate]{

  def apply(
    arrayOptMap: Array[Option[Map[String, String]]] = Array.empty
  ) = {
    new ArrayOptMapAggregate(
      _locator = None
    , _URI = null
    , _arrayOptMap = arrayOptMap)
  }

}
