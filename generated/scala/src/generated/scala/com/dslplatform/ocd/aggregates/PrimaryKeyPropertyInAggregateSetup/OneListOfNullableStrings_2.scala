package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableStrings_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableStrings: IndexedSeq[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableStrings_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableStrings_2("+ URI +")"

   def copy(oneListOfNullableStrings: IndexedSeq[Option[String]] = this._oneListOfNullableStrings): OneListOfNullableStrings_2 = {

  require(oneListOfNullableStrings ne null, "Null value was provided for property \"oneListOfNullableStrings\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStrings)
    new OneListOfNullableStrings_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableStrings = oneListOfNullableStrings)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableStrings_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableStrings = result._oneListOfNullableStrings
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableStrings_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableStrings = {
    _oneListOfNullableStrings
  }

  def oneListOfNullableStrings_= (value: IndexedSeq[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings") oneListOfNullableStrings: IndexedSeq[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableStrings = if (oneListOfNullableStrings == null) IndexedSeq.empty else oneListOfNullableStrings)

}

object OneListOfNullableStrings_2 extends AggregateRootCompanion[OneListOfNullableStrings_2]{

  def apply(
    oneListOfNullableStrings: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStrings)
    require(oneListOfNullableStrings ne null, "Null value was provided for property \"oneListOfNullableStrings\"")
    new OneListOfNullableStrings_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableStrings = oneListOfNullableStrings)
  }

}
