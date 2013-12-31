package com.dslplatform.ocd.aggregates.SetOptMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptMap: Set[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptMapInAggregate.SetOptMapAggregate): this.type = {
    this.URI = result.URI;
    this._setOptMap = result._setOptMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptMapInAggregate.SetOptMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptMap")
  def setOptMap = {
    _setOptMap
  }

  def setOptMap_= (value: Set[Option[Map[String, String]]]) {
    _setOptMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptMap") setOptMap: Set[Option[Map[String, String]]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptMap = if (setOptMap == null) Set.empty else setOptMap)

}

object SetOptMapAggregate extends AggregateRootCompanion[SetOptMapAggregate]{

  def apply(
    setOptMap: Set[Option[Map[String, String]]] = Set.empty
  ) = {
    new SetOptMapAggregate(
      _locator = None
    , _URI = null
    , _setOptMap = setOptMap)
  }

}
